package ReadingAndWritingToFiles;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MainClass {

    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\Ridvan\\workspace\\Files-Paths-Streams\\test.txt");
        File file = new File("test.txt");
        try {
            System.out.println(FileUtils.getInstance().readFrom(path));
            System.out.println(FileUtils.getInstance().readFrom(file));
            FileUtils.getInstance().writeFrom(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
