package PropertiesFileParser;

import java.io.IOException;

public class MainClass {

    public static void main(String[] args) {
        
        try {
            System.out.println(PropertiesFile.getInstance().parseProperties().toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
