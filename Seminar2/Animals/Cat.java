package Seminar2.Animals;
import Seminar2.*;

import java.time.LocalDate;

import Seminar2.interfaces.Goable;

public class Cat extends Animal implements Goable {

    public Cat() {}

    public Cat(String name, LocalDate birthday, Illness illness) {
        super(name, birthday, illness);
    }
}