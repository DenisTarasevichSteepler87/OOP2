package Seminar2.interfaces;

public interface Swimable {
    default void swim(double speed) {
        System.out.println(getClass().getSimpleName() + " плавает со скоростью: " + speed);
    }
}