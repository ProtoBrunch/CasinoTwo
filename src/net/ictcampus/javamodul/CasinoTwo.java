package net.ictcampus.javamodul;

/**
 * This class contains the main()-method.
 * It also creates a static instance of both the "Textausgabe"- and "the Benutzereingabe"-class
 */
class CasinoTwo {
static Textausgaben textausgaben = new Textausgaben();
static Benutzereingaben benutzereingaben = new Benutzereingaben();

    //Constructor for the CasinoTwo-Class
    private CasinoTwo(){
        Player basil = new Player("Gallati","Basil",1991);
        Player jonas = new Player("Wittwer", "Jonas", 1994);
        Player robin = new Player("Berberat", "Robin", 1991);
        Player damian = new Player("Schneuwly","Damian",1992);
        Player silas = new Player("Meier","silas",1997);

        Employee michael = new Employee("Beck","Michael",1990);
        Employee melanie = new Employee("Stucki","Melanie", 1993);

        RandomGuess rndgssOne = new RandomGuess("Random Guess");
        LuckySeven lckySevnOne = new LuckySeven("Lucky Seven");

        DealTable elephant = new DealTable("Elephant",rndgssOne,michael);
        DealTable tapir = new DealTable("Tapir",lckySevnOne,melanie);

        michael.sayWelcome();

        elephant.addPlayer(basil);
        elephant.addPlayer(jonas);

        tapir.addPlayer(robin);
        tapir.addPlayer(damian);

        elephant.showInfos();
        tapir.showInfos();

        tapir.play();
    }

    public static void main(String[] args) {
        CasinoTwo casino = new CasinoTwo();
    }
}