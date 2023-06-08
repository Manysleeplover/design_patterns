package ru.romanov.patterns.behaviors;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Отсутствие кряка");
    }
}
