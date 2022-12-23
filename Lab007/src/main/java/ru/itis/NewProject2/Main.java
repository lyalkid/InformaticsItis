package ru.itis.NewProject2;

import java.util.Scanner;
import ru.itis.NewProject2.Otrezok;

public class Main{

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    

    Otrezok k1 = new Otrezok();

    k1.p1.x = sc.nextDouble(); k1.p1.y = sc.nextDouble();
    k1.p2.x = sc.nextDouble(); k1.p2.y = sc.nextDouble();

    System.out.println("координаты точки середины отрезка: M("+k1.seredina_x()+";"+k1.seredina_y()+")");
    }

}

