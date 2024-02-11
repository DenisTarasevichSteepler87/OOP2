package Seminar2.Animals;

import java.time.LocalDate;

import Seminar2.Illness;
import Seminar2.interfaces.Swimable;

public class Dolphin extends Animal implements Swimable{
    public Dolphin(String name, LocalDate birthday, Illness illness) {
        super(name, birthday, illness);
    }
}