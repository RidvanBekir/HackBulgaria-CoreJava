package BrokenLinks;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class BrokenLinks {

    public static boolean findBrokenLinks(Path path) throws IOException {

        boolean result = false;
        ArrayList<File> files = new ArrayList<File>();
        File directory = new File(path.toString());
        File[] fList = directory.listFiles();
        try {
            for (File file : fList) {
                files.add(file);
                if (file.isDirectory()) {
                    findBrokenLinks(file.toPath());
                }
            }
        } catch (NullPointerException e) {
            System.err.println("Directory does not exist!");
        }
        for (File file : files) {
            if (Files.isSymbolicLink(file.toPath())) {
                String pathToObject = (file.getAbsolutePath().substring(0,
                        file.getAbsolutePath().lastIndexOf(File.separator))
                        + "\\" + Files.readSymbolicLink(file.toPath()));
                Path paths = Paths.get(pathToObject);
                if (!Files.exists(paths)) {
                    result = true;
                    System.out.println(file.toString());
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\Ridvan\\workspace\\Files-Paths-Streams");
        try {
            findBrokenLinks(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
