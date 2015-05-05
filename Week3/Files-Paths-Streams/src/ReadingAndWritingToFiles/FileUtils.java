package ReadingAndWritingToFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;

public class FileUtils {

    private static FileUtils instance = null;

    public static FileUtils getInstance() {
        if (instance == null) {
            instance = new FileUtils();
        }
        return instance;
    }

    private FileUtils() {
    }

    public String readFrom(File file) throws IOException {
        StringBuilder strBuilder = new StringBuilder();
        BufferedReader inputStream = null;
        try {
            inputStream = new BufferedReader(new FileReader(file));
            String l;
            while ((l = inputStream.readLine()) != null) {
                strBuilder.append(l);
            }

        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
        return strBuilder.toString();
    }

    public String readFrom(Path path) throws IOException {
        File file = new File(path.toString());
        return readFrom(file);
    }

    public void writeFrom(File file) throws IOException {
        BufferedReader inputStream = null;
        PrintWriter outputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader(file));
            outputStream = new PrintWriter(new FileWriter("outputFile"));

            String l;
            while ((l = inputStream.readLine()) != null) {
                outputStream.println(l);
            }
            System.out.println("File written to directory");
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }

    public void writeFrom(Path path) throws IOException {
        File file = new File(path.toString());
        writeFrom(file);
    }
}
