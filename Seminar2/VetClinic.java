package Seminar2;
import Seminar2.Animals.*;
import Seminar2.Personal.*;

import java.util.List;

import Seminar2.interfaces.Goable;
import Seminar2.interfaces.Swimable;
import Seminar2.Personal.Nurce;
import Seminar2.Personal.Personal;
import Seminar2.interfaces.Flyable;

public class VetClinic {
    String name;
    List<Animal> animals;
    List<Personal> personals;

    public VetClinic (String name, List<Animal> animals, List<Personal> personals) {
        this.name = name;
        this.animals = animals;   
        this.personals = personals;     
    }
    
    public void getGoable(List<Animal> animals) {
        for (Animal animal : animals) {
            if (animal instanceof Goable) {
                System.out.println(animal.getClass().getSimpleName() + " is goable");
            }
        }
    }

    public void getSwimable(List<Animal> animals) {
        for (Animal animal : animals) {
            if (animal instanceof Swimable) {
                System.out.println(animal.getClass().getSimpleName() + " is swimable");
            }
        }
    }

    public void getFlyable(List<Animal> animals) {
        for (Animal animal : animals) {
            if (animal instanceof Flyable) {
                System.out.println(animal.getClass().getSimpleName() + " is flyable");
            }
        }
    }

    public void getDoctor(List<Personal> personals) {
        for (Personal person : personals) {
            if (person instanceof Doctor) {
                ((Doctor) person).doDiagnoze();
            }
        }
    }

    public void getPersonal(List<Personal> personals) {
        for (Personal person : personals) {
            if (person instanceof Doctor) {
                ((Doctor) person).doDiagnoze();
            } else {
                ((Nurce) person).doVaccine();
            }
        }
    }
}