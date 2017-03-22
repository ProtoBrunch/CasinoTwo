package net.ictcampus.javamodul;
import java.util.Scanner;

/**
 * This class handles and validates all the Console-Inputs in this project.
 * It's methods are referenced via the static instace of this class inside the CasinoTwo-class.
 *
 * This class is currently functional, but incomplete.
 * Currently missing from this class is:
 *     - any form of validation for the given inputs. ;^)
 */
class Benutzereingaben {
    private Scanner scanner = new Scanner(System.in);

    // This method handles the Console-inputs required to place a guess in a RandomGuess-class.
    int eingabeRandomGuess(){
        return scanner.nextInt();
    }

    // This method handles the Console-inputs required for a Player to place a Bet in any Game-subclass.
    int playerPlacesBet(){
        return  scanner.nextInt();
    }

    // This method handles the Console-inputs required to place a guess in a LuckySeven-class.
    int eingabeGuessLuckySeven(){
        return scanner.nextInt();
    }
}