package ru.itis.TenTasks;

import java.util.Scanner;

public class TaskSix {
    private static final double EPS = 0.0000001;

    private static double[] solveQuadraticEquasion(double a, double b, double c) {
        var D = b * b - 4 * a * c;

        if (a == 0) {
            return new double[] { -c / b };
        }

        if (D > 0) {
            var result = new double[] { -b + Math.sqrt(D) / 2 / a, -b - Math.sqrt(D) / 2 / a };
            return result;
        }

        if (D == 0) {
            return new double[] { -b / 2 / a };
        }

        return new double[] {};
    }

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        double a = scanner.nextDouble(), b = scanner.nextDouble(), c = scanner.nextDouble();
        double[] korni = solveQuadraticEquasion(a, b, c);

        if (korni.length == 0) {
            System.out.print("У уравнения нет действительных решений");
            scanner.close();
            return;
        }

        System.out.print("Корни уравнения: ");
        for (double root : korni) {
            System.out.printf("%f ", root);
        }

        scanner.close();
    }
}
