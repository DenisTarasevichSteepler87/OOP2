package Seminar2.Animals;

import java.time.LocalDate;

import Seminar2.interfaces.Goable;
import Seminar2.Illness;
import Seminar2.interfaces.Flyable;
import Seminar2.interfaces.Swimable;

public class Duck extends Animal implements Goable, Flyable, Swimable{
    public Duck(String name, LocalDate birthday, Illness illness) {
        super(name, birthday, illness);
    }
}