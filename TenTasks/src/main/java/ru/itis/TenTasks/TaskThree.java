package ru.itis.TenTasks;

import java.util.Scanner;

public class TaskThree {
    private static final double EPS = 0.0000001;

    private static double max(double a, double b) {
        if (a > b) return a;
        return b;
    }

    private static double sqrt(double x) {
        var l = 0d;
        var r = max(1d, x);
        var m = (l + r) / 2;

        while (r - l > EPS) {
            if (m * m > x) r = m;
            else l = m;

            m = (l + r) / 2;
        }

        return l;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        double number = scanner.nextDouble();

        System.out.println(sqrt(number));
    }
}
