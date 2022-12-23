package ru.itis.TenTasks;
import java.util.Scanner;
public class TaskSeven{
    private static boolean decending(int number) {
        var prevDigit = number % 10;

        while (number > 10) {
            number /= 10;
            if (prevDigit > number % 10)
                return false;
            prevDigit = number % 10;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String lineWithNumbers = scanner.nextLine();
        String[] numbers = lineWithNumbers.split(" ");

        var numbersDecending = 0;

        for (int i = 0; i < numbers.length; i++) {
            var number = Integer.parseInt(numbers[i]);
            if (decending(number))
                numbersDecending++;
        }

        if (numbersDecending == 3) {
            System.out.println("Есть три числа");
        } else {
            System.out.println("Нет таких чисел");
        }

        scanner.close();
    }
}
