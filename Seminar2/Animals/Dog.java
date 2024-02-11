package Seminar2.Animals;

import java.time.LocalDate;

import Seminar2.Illness;
import Seminar2.interfaces.Goable;

public class Dog extends Animal implements Goable {

    public Dog() {}
    
    public Dog(String name, LocalDate birthday, Illness illness) {
        super(name, birthday, illness);
    }

}