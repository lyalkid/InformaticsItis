package sobranieSochineniy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class FileReader {
    public static String read(String fileName) {
        String str = null;
        try {
            str = new String(Files.readAllBytes(Paths.get(fileName)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return str;
    }
}