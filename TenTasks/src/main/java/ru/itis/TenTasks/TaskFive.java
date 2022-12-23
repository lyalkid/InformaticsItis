package ru.itis.TenTasks;

import java.util.Scanner;

public class TaskFive {
    private static double EPS = 0.0000000001;

    private static double sin(double x) {
        double result = x;
        double prevTerm = x;

        var i = 1;
        while (prevTerm > EPS) {
            var nextTerm = prevTerm * x / (i * 2) * x / (i * 2 + 1);
            int sign = i % 2 == 0 ? 1 : -1;

            result += sign * nextTerm;
            prevTerm = nextTerm;
            i++;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        double x = scanner.nextDouble();

        System.out.printf("sin(x) = " + sin(x));
    }
}