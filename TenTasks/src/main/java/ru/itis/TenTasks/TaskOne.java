package ru.itis.TenTasks;

public class TaskOne {
    public static void main(String[] args) {
        int n = 3;
        for (int i = 0; i < n; ++i) {
            for (int l = 0; l < 2 * n - i; ++l) {
                System.out.print(" ");
            }
           for (int s = 0; s < 2 * i + 1; ++s) {
                System.out.print("*");
            }
            for (int r = 0; r < 2 * n - i; ++r) {
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < n; ++i) {
            for (int l = 0; l <  n - 1 - i; ++l) {
                System.out.print(" ");
            }
            for (int s = 0; s < 2 * i + 1; ++s) {
                System.out.print("*");
            }
            for (int c = 0; c < 2*n - 2*i + 1; ++c) {
                System.out.print(" ");
            }
            for (int s = 0; s < 2 * i + 1; ++s) {
                System.out.print("*");
            }
            for (int r = 0; r < n - 1 - i; ++r) {
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
