package sobranieSochineniy;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class Test{
        public static void main(String[] args) throws FileNotFoundException{
                String text = read("C:\\Users\\Азамат\\IdeaProjects\\NewProject2\\sobranieSochineniy\\src\\test.txt");
                String[] chOfText = text.split(" ");
                String space = " ";
                for (String i: chOfText){
                        i = "<" + i + ">";
                        System.out.println(i);

                }
                System.out.println(space);

        }
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