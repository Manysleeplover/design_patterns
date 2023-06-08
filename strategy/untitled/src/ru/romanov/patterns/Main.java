package ru.romanov.patterns;

import ru.romanov.patterns.behaviors.FlyNoWay;
import ru.romanov.patterns.behaviors.FlyWithWings;
import ru.romanov.patterns.behaviors.MuteQuack;
import ru.romanov.patterns.behaviors.Quack;
import ru.romanov.patterns.ducks.Duck;

public class Main {
    public static void main(String[] args) {
        Duck duck1 = new Duck(new FlyNoWay(), new MuteQuack());
        duck1.performFly();
        duck1.performQuack();
        duck1.swim();

        System.out.println("\n");

        Duck duck2 = new Duck(new FlyWithWings(), new Quack());
        duck2.performFly();
        duck2.performQuack();
        duck2.swim();
    }
}