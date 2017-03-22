package net.ictcampus.javamodul;

/**
 * This class handles all the TextToConsole-Outputs in this project.
 * It's methods are referenced via the static instace of this class inside the CasinoTwo-class.
 */
class Textausgaben {
    private String output;

    // Prints the announcement, that the player's action to place a bet failed, to the console.
    void placeBetFailure(Player player, int bet) {
        output = String.format("%s does not have enough Credit to place a bet of %d Credits.\nA Bet of 0 Credits is now being placed.", player.getFullName(), bet);
        System.out.println(output);
    }

    // Prints the announcement, that the player's action to place a bet succeeded, to the console.
    void placeBetSuccess(Player player, int bet) {
        output = String.format("%s places a bet of %d", player.getFullName(), bet);
        System.out.println(output);
    }

    // Prints an Employees personalized greetings to the console.
    void greetToCasino(String name) {
        output = String.format("Hello Customer, I am %s.\nWelcome to our Casino.", name);
        System.out.println(output);
    }

    // Prints the order to place a guess within speciified Ranges to the cosnsole.
    void askForInputWithRanges(int rangeFloor, int rangeCeiling) {
        output = String.format("Please make your guess. [%d-%d]", rangeFloor, rangeCeiling);
        System.out.println(output);
    }

    // Prints a repeated order to place a guess within specified Ranges to the cosnsole.
    void repeatAskForInputWithRanges(int rangeFloor, int rangeCeiling) {
        output = String.format("Your Input was not accepted. Please take a guess within the given Range. [%d-%d]", rangeFloor, rangeCeiling);
        System.out.println(output);
    }

    // Prints the announcement, that a Table is full to the console.
    void maxPeopleAtTable() {
        output = "The Table is already full.";
        System.out.println(output);
    }

    // Prints the current state of a given Table to the console.
    void showTableInfos(String tableName, Game game, Employee employee, int numbersOfPeopleAtTable) {
        output = "At Table %s, the Game currently being played is %s.\nThe Dealer at the Table is %s and there are %d Player/s playing.";
        output = String.format(output, tableName, game.getName(), employee.getFullName(), numbersOfPeopleAtTable);
        System.out.println(output);
    }

    // Prints the announcement, that a player has won the game to the console.
    void playerHasWon() {
        output = "Hooray! You won!";
        System.out.println(output);
    }

    // Prints the announcement, that a player has lost the game to the console.
    void playerHasLost() {
        output = "Oh no! You lost!";
        System.out.println(output);
    }

    // Prints the question, how much a given Player is willing to bet to the console.
    void askPlayerToPlaceBet(Player player) {
        output = "%s, how much are you willing to bet?";
        output = String.format(output, player.getFullName());
        System.out.println(output);
    }

    // Prints the announcement of the winning number to the console.
    void revealWinningNumber(int number) {
        output = "The Winning Number was %d.";
        output = String.format(output, number);
        System.out.println(output);
    }

    // Prints the announcement, that a Player has guessed to high to the console.
    void guessTooHigh() {
        output = "Your guess was too high.";
        System.out.println(output);
    }

    // Prints the announcement, that a Player has guessed to low to the console.
    void guessTooLow() {
        output = "Your guess was too low.";
        System.out.println(output);
    }

    // Prints the announcement, how much a credit a Player possesses to the console.
    void announceNewCredit(String name, int credit) {
        output = "%s, your new Credit is %d";
        output = String.format(output, name, credit);
        System.out.println(output);
    }

    // Prints the announcement, how many guesses a player has left in the current game to the console.
    void announceGuessesLeft(int guessesDone, int guessesTotal) {
        output = "You have %d guesses left.";
        output = String.format(output,(guessesTotal-guessesDone));
        System.out.println(output);
    }

    // Prints the announcement of what the Dice have rolled in a LuckySeven-game to the console.
    void announceDiceResult(int result){
        output = "The Dice have rolled a total of %d";
        output = String.format(output,result);
        System.out.println(output);
    }

    // Prints the announcement, that a Player has won triple his bet in a LuckySeven-Game to the console.
    void announceLuckySevenTripleWin(){
        output = "You won triple your bet!";
        System.out.println(output);
    }

    // Prints the announcement, that a Player has won double his bet in a LuckySeven-Game to the console.
    void announceLuckySevenDoubleWin(){
        output = "You won double your bet!";
        System.out.println(output);
    }

    // Prints the announcement, that a Player has triple his bet back in a LuckySeven-Game to the console.
    void announceLuckySevenSimpleWin(){
        output = "You won your bet back!";
        System.out.println(output);
    }

    // Prints the announcement, that a Player has lost his bet in a LuckySeven-Game to the console.
    void announceLuckySevenLoss(){
        output = "You lost!";
        System.out.println(output);
    }
}