package ru.itis.lab12.HTML;



import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReader {
    public static void main(String[] args) throws IOException {
        System.out.println(read("pushkin.txt"));
    }

    public static String read(String fileName) {
        String str = null;
        try {
            str = new String(Files.readAllBytes(Paths.get(fileName)));
        } catch (IOException e) {
            System.out.println("Ошибка ввода вывода");
            e.printStackTrace();
        }
        return str;
    }
}
