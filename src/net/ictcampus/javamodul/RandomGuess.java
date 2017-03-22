package net.ictcampus.javamodul;
import static net.ictcampus.javamodul.CasinoTwo.*;

/**
 * Subclass "RandomGuess" of the abstract class "Game".
 *
 * "Random Guess" revolves around the player trying to guess a randomly generated number with only 6 guesses.
 * After Each guess, the player gets to know, if he guesses too high or too low.
 * Should the Player succeed, he wins three times the amount of his bet, divided by the amount of guesses he needed.
 * This translates to an effective winnings of:
 *     1 Guess   : 3 times the bet
 *     2 Guesses : 1.5 times the bet
 *     3 Guesses : 1 times the bet ("break even")
 *     4 Guesses : 0.75 the bet
 *     5 Guesses : 0.6 times the bet
 *     6 Guesses : 0.5 times the bet
 *
 * Should a player use up all of his attempts to guess the number, he loses the game and his bet.
 */
class RandomGuess extends Game {
    private int counter = 0;

    RandomGuess(String name){
        super(name);
    }

    // If called, this Method plays once through the game "Random Guess"
    public boolean play(){
        int amountOfGuesses = 6;

        int randomNumber = random.nextInt(100)+1;
        do{
        textausgaben.askForInputWithRanges(1,100);
        int playerNumber = benutzereingaben.eingabeRandomGuess();
        while(playerNumber < 1 || playerNumber > 100){
            textausgaben.repeatAskForInputWithRanges(1,100);
            playerNumber = benutzereingaben.eingabeRandomGuess();
        }
        if(randomNumber == playerNumber){
            textausgaben.playerHasWon();
            textausgaben.revealWinningNumber(randomNumber);
            return true;
        }
        if(randomNumber > playerNumber){
            textausgaben.guessTooLow();
        }else{
            textausgaben.guessTooHigh();
        }
        counter++;
        textausgaben.announceGuessesLeft(counter, amountOfGuesses);
        }while(counter < amountOfGuesses);
        textausgaben.playerHasLost();
        textausgaben.revealWinningNumber(randomNumber);
        counter = 0;
        return false;
    }

    // If called, this Method return the amount of credits won.
    public int payWin(int pot){
        int winnings = (3*pot/counter);
        counter = 0;
        return winnings;
    }
}