package ru.itis.controlTest2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //футболист
        Footballer footballer = new Footballer();
        System.out.println("Введите имя игрока ");

        footballer.name = scanner.nextLine();

        footballer.sleep();
        footballer.eat();
        footballer.train();
        System.out.println();
        
        
        // баскетболист 
        BasketballPlayer basketballer = new BasketballPlayer();
        System.out.println("Введите имя игрока ");
        basketballer.name = scanner.nextLine();

        System.out.println("Сколько " + basketballer.name + " спал?");
        basketballer.sleepingTime = scanner.nextInt();
        SleepingHour sleepTime = new SleepingHour(basketballer.sleepingTime);
        basketballer.sleep();
        System.out.println();

        System.out.println("Сколько " + basketballer.name + " тренировался?");
        basketballer.trainngTime = scanner.nextInt();
        basketballer.train();
        System.out.println();

        System.out.println("Что " + basketballer.name + " ест перед тренировкой?");
        basketballer.eat();

    }
}
