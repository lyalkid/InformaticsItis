package ru.itis.TenTasks;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int k = scanner.nextInt();
        int m = scanner.nextInt();

        for (int i = k + 1; i < m; i++) {
            if (i % 3 == 0){
                System.out.print(i+" ");
            }
        }

    }
}