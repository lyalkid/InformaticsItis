package ru.itis.controlTest2;

public class Footballer extends Athlete{
    String name;
    Dish meal = new Dish();
    @Override
    public void eat(){
        System.out.println(name + " кушает " + meal.x );
    }

    @Override
    public void sleep() {
        System.out.println(name + " спит");
    }

    @Override
    public void train() {
        System.out.println(name + " тренеруется");
    }

}
