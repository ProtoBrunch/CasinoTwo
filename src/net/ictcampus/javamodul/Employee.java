package net.ictcampus.javamodul;
import static net.ictcampus.javamodul.CasinoTwo.*;

/**
 * Subclass "Employee" of the abstract class "Person".
 *
 * This class is used to initialize a new Employee for a Casino.
 */
class Employee extends Person{
    private int wage;

    Employee(String name, String prename, int birthyear) {
        super(name, prename, birthyear);
    }

    void sayWelcome(){
        textausgaben.greetToCasino(getFullName());
    }
}