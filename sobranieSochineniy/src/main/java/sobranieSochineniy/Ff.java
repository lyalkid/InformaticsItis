package sobranieSochineniy;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;

public class Ff {
    public static void main(String[] args) {
        BufferedReader reader;
        int i = 0;

        String space = "";
        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\Азамат\\Downloads\\Blok.txt"));
            String line =reader.readLine().toLowerCase();

            while (line != null) {
                //убираем лишние символы
                char[] charsOfLine = line.toCharArray();
                for(int k = 0; k < charsOfLine.length; k++){
                    if(!Character.isAlphabetic(charsOfLine[k])){
                        charsOfLine[k] = ' ';
                    }
                }

                String tneSameString = new String(charsOfLine);
                //System.out.println(tneSameString);

                space+= tneSameString + " ";
                // read next line
                line = reader.readLine();
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(space);
        /*String[] text = space.split(" ");
        for (i = 0; i < text.length; i++){
            text[i] = text[i].toLowerCase();
        }
        System.out.println(Arrays.toString(text));*/
        char codePoint = '«';
        System.out.println(Character.isAlphabetic(codePoint));
    }
}
