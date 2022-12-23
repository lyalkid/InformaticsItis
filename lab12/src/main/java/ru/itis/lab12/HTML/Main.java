package ru.itis.lab12.HTML;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        student.setFio("Азамат Ильдарович");
        student.setBirthDate("2004-02-25");
        student.setGender("M");

        student.setYear(2022);
        student.setGroup("11-205");

        HTMLPersonWriter writer
                = new HTMLStudenWriter(student, "student.html");
        writer.print();
    }
}