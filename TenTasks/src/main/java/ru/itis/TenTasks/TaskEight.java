package ru.itis.TenTasks;
import java.util.Scanner;
public class TaskEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        a[0] = 1;
        a[1] = -3;
        System.out.print(a[0]+ " " + a[1]+" ");
        for (int i = 2;  i < n; i++){
            if (i %2 == 0) {
                a[i] = a[i-1] *(-1) + 2;
            } else {
                a[i] = (a[i-1] + 2) * (-1);
            }
            System.out.print(a[i] + " ");
        }
    }


}
