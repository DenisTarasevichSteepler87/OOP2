package Seminar2.interfaces;

public interface Goable {
    default void run(double speed) {
        System.out.println(getClass().getSimpleName() + " бежит со скоростью: " + speed);
    }
}