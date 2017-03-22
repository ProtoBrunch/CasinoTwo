package net.ictcampus.javamodul;
import static net.ictcampus.javamodul.CasinoTwo.*;

/**
 * Subclass "Employee" of the abstract class "Person".
 *
 * This class is used to initialize a new Player for a Casino.
 * Each Player starts out with 10'000 Credits.
 */
class Player extends Person {
    private int credit = 10000;

    Player(String name, String prename, int birthyear) {
        super(name, prename, birthyear);
    }

    /*If called, this Method checks if the Player possesses the amount he wishes to bet.
    * If he does, the amount given is returned. If he doesn't, 0 is returned and the Player
    */
    int putAtStake(int bet){
        if(credit >= bet){
            textausgaben.placeBetSuccess(this, bet);
            credit -= bet;
            return bet;
        }else{
            textausgaben.placeBetFailure(this, bet);
            return 0;
        }
    }

    /* If called, this method adds the amount given to the credit-variable,
     * and calls a Textausgabe-method to announce the new amount of Credits the player possesses.
     */
    void earnCredits(int earnings){
        credit += earnings;
        textausgaben.announceNewCredit(this.getFullName(),credit);
    }
}