package Seminar2;
import Seminar2.Animals.*;
import Seminar2.Personal.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Seminar2.Animals.Dog;
import Seminar2.Animals.Dolphin;
import Seminar2.Animals.Duck;
import Seminar2.Animals.Fish;
import Seminar2.Personal.Nurce;
import Seminar2.Personal.Personal;

public class Program {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Шарик", LocalDate.of(2020, 5, 27), new Illness("глухота"));
        Cat cat1 = new Cat("Мурка", LocalDate.of(2024, 1, 1), new Illness("рана на левой лапе"));
        Fish fish1 = new Fish("Окунь", LocalDate.of(2020, 12, 20), new Illness("соль"));
        Duck duck1 = new Duck("Кряк", LocalDate.of(2021, 9, 3), new Illness("привит"));
        Dolphin dolphin1 = new Dolphin("Нелси", LocalDate.of(2021, 8, 31), new Illness("привит"));

        List<Animal> animals = new ArrayList<Animal>(Arrays.asList(dog1, cat1, fish1, duck1, dolphin1));
        System.out.println(animals);
        System.out.println("--------------");

        dog1.run(10);
        cat1.run(9);
        fish1.swim(8);
        duck1.run(2);
        duck1.fly(3);
        duck1.swim(3);
        dolphin1.swim(12);
        System.out.println("--------------");
        
        Nurce nurce1 = new Nurce("Максим Леонидович");
        Doctor doctor1 = new Doctor("Вера Петровна", nurce1);
        List<Personal> personals = new ArrayList<>(Arrays.asList(nurce1, doctor1));

        VetClinic vetClinic = new VetClinic("Лапочка Плюс", animals, personals);

        vetClinic.getGoable(animals);
        System.out.println("--------------");
        vetClinic.getSwimable(animals);
        System.out.println("--------------");
        vetClinic.getFlyable(animals);
        System.out.println("--------------");
        vetClinic.getDoctor(personals);
        System.out.println("--------------");
        vetClinic.getPersonal(personals);

    }
}