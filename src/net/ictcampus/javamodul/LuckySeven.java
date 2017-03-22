package net.ictcampus.javamodul;
import static net.ictcampus.javamodul.CasinoTwo.*;

/**
 * Subclass "LuckySeven" of the abstract class "Game".
 *
 * "Lucky Seven" revolves around a Player betting on a number between 2 and 12.
 * Once the bet is placed, two dice are rolled and their values summed up.
 * Depending on the Players bet and the sum of the Dice, the following results are possible:
 *
 *     The player bet on number 7 and the sum of the Dice is 7:
 *         -> The player wins 3 times his bet back.
 *
 *     The player bet on any other number and the sum of the Dice match the number bet on:
 *         -> The player wins 2 times his bet back.
 *
 *     The player bet on a number present in one of the given lines and the sum of the Dice match a different Number in the same Line:
 *         -> The player wins his bet back.
 *
 *     Any other result ends in the player losing the game and his bet.
 */
class LuckySeven extends Game{
    private int calculator;
    private int[] leftLine = {2,5,8,10,11};
    private int[] rightLine = {3,4,6,9,12};

    LuckySeven(String name) {
        super(name);
    }

    // If called, this Method plays once through the game "Random Guess"
    public boolean play(){
        int diceOne = random.nextInt(6)+1;
        int diceTwo = random.nextInt(6)+1;
        int diceTotal = diceOne + diceTwo;
        textausgaben.askForInputWithRanges(2,12);
        int playerGuess = benutzereingaben.eingabeGuessLuckySeven();
        while(playerGuess < 2 || playerGuess > 12){
            textausgaben.repeatAskForInputWithRanges(2,12);
            playerGuess = benutzereingaben.eingabeGuessLuckySeven();
        }
        textausgaben.announceDiceResult(diceTotal);
        if(playerGuess == 7 && diceTotal == 7){
            textausgaben.announceLuckySevenTripleWin();
            calculator = 3;
            return true;
        }else if(diceTotal != 7 && playerGuess == diceTotal){
            textausgaben.announceLuckySevenDoubleWin();
            calculator = 2;
            return true;
        }else if(diceTotal != 7 && checkIfGuessIsInArray(playerGuess, selectArrayBasedOnDiceTotal(diceTotal))){
            textausgaben.announceLuckySevenSimpleWin();
            calculator = 1;
            return true;
        }else{
            textausgaben.announceLuckySevenLoss();
            return false;
        }


    }

    // If called, this Method selects the int[]-Array  based on the sum of the Dice.
    private int[] selectArrayBasedOnDiceTotal(int diceTotal){
        int[] empty = {0};
        if(diceTotal == 2 || diceTotal == 5 || diceTotal == 8 || diceTotal == 10 || diceTotal == 11){
            return leftLine;
        }else if(diceTotal == 3 || diceTotal == 4 || diceTotal == 6 || diceTotal == 9 || diceTotal == 12){
            return rightLine;
        }else{
            return empty;
        }
    }

    // If called, this Method iterates through the given int[]-Array and returns true if the given int exists within the Array, else it returns false.
    private boolean checkIfGuessIsInArray(int guess, int[] array){
        for (int intInArray: array) {
            if(intInArray == guess){
                return true;
            }
        }
        return false;
    }

    // If called, this Method return the amount of credits won.
    public int payWin(int pot){
        return pot*calculator;
    }
}