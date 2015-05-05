package ImplementTheWcCommand;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MainClass {

    public static void main(String[] args) {

        Path path = Paths.get("C:\\Users\\Ridvan\\workspace\\Files-Paths-Streams\\test.txt");
        // File file = new File("test.txt");

        try {
            System.out.println("Number of words : " + WordCountResult.getInstance().wordCount(path).getWords());
            System.out.println("Number of lines : " + WordCountResult.getInstance().wordCount(path).getLines());
            System.out.println("Number of characters : "
                    + WordCountResult.getInstance().wordCount(path).getCharacters());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
