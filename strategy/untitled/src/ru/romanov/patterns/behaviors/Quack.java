package ru.romanov.patterns.behaviors;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Кряк");
    }
}
