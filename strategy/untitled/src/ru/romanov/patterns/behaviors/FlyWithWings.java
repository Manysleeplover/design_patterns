package ru.romanov.patterns.behaviors;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Полёт");
    }
}
