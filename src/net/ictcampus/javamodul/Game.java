package net.ictcampus.javamodul;
import java.util.Random;

/**
 * This is the parent class for all "Game"-Subclasses.
 * This class is abstract, as to avoid an accidental instance of this class that would serve no use.
 * All given Methods except for the constructor and the Name-getter are specified in the different subclasses.
 */
abstract class Game {
    private String name;
    Random random = new Random();

    Game(String name){
        this.name = name;
    }

    public abstract boolean play();

    public abstract int payWin(int pot);

    String getName(){
        return name;
    }
}