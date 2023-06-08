package ru.romanov.patterns.behaviors;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Отсутствие полёта");
    }
}
