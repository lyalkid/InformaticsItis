package ru.itis.lab10;

public class MakeSimpleList {
    public static void main(String[] args) {
        Element root = new Element(10);
        Element e1 = new Element(20);
        root.next = e1;
        Element e2 = new Element(15);
        e1.next = e2;
    }
}
