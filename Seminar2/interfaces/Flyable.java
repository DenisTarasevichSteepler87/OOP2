package Seminar2.interfaces;

public interface Flyable {
    default void fly(double speed) {
        System.out.println(getClass().getSimpleName() + " летит со скоростью: " + speed);
    }
}