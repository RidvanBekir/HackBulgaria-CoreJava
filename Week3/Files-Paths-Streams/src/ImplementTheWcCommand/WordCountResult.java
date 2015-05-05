package ImplementTheWcCommand;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class WordCountResult {

    private int words;
    private int lines;
    private int characters;

    private static WordCountResult instance = new WordCountResult();
    
    public static WordCountResult getInstance() {
        return instance;
    }

    private WordCountResult() {
    }

    public WordCountResult wordCount(Path path) throws IOException {
        File file = new File(path.toString());
        Scanner input = new Scanner(new FileReader(file));
        int words = 0;
        int lines = 0;
        int characters = 0;
        while (input.hasNextLine()) {
            String line;
            line = input.nextLine();
            lines++;

            String[] str = line.split((" "));
            for (int i = 0; i < str.length; i++) {
                if (str[i].length() > 0) {
                    words++;
                }
                characters += str[i].length();
            }
        }
        input.close();
        this.words = words;
        this.lines = lines;
        this.characters = characters;
        return instance;
    }
    
    public static WordCountResult wordCount(File file) throws IOException{
        return WordCountResult.instance.wordCount(file.toPath());
    }

    public int getWords() {
        return words;
    }

    public int getLines() {
        return lines;
    }

    public int getCharacters() {
        return characters; 
    }
}
