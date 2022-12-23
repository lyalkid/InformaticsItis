package ru.itis.lab10;

import java.util.Scanner;

public class MakeDynamicsList {
    public static void main(String[] args) {
        Element root = new Element(10);

        Element current = root;

        int nextValue = 100;
        do {
            Scanner scanner = new Scanner(System.in);
            nextValue = scanner.nextInt();

            Element element = new Element(nextValue);
            current.next = element;

            current = element;
        } while (nextValue >= 0);

        current = root;
        while (current.next != null) {
            System.out.print(current.a +" ");
            current = current.next;
        }
    }
}
