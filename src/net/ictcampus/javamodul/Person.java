package net.ictcampus.javamodul;

/**
 * This is the parent class for all "Person"-Subclasses.
 * This class is abstract, as to avoid an accidental instance of this class that would serve no use.
 * All given Methods except for the constructor and the Name-getter are specified in the different subclasses.
 */
abstract class Person {
    private int birthyear;
    private String name;
    private String prename;

    Person(String name, String prename, int birthyear){
        this.birthyear = birthyear;
        this.name = name;
        this.prename = prename;
    }

    String getFullName(){
        return prename+" "+name;
    }
}