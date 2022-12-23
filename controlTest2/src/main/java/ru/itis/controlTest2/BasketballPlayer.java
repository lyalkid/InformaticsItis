package ru.itis.controlTest2;
import java.util.Scanner;

public class BasketballPlayer extends Athlete {
    String name;

    Dish meal = new Dish();
    int trainngTime;
    int sleepingTime;

    @Override
    public void eat(){
        System.out.println(name + " кушает " + meal.x );
    }

    @Override
    public void sleep() {
        System.out.println(name + " спал " + sleepingTime + " часов" );
    }

    @Override
    public void train() {
        System.out.println("игрок тренеровался " + trainngTime + " часов");
    }

}
