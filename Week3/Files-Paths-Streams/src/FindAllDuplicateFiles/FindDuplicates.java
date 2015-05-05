package FindAllDuplicateFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {

    private static List<File> files = new ArrayList<File>();

    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\Ridvan\\Desktop\\New folder");
        duplicateFiles(path);
    }

    public static void duplicateFiles(Path path) {
        findFiles(path);
        if (files.isEmpty()) {
            System.out.println("There are no files in this directory");
            return;
        }
        List<File> duplicateFiles = new ArrayList<File>();
        StringBuilder duplicatePaths = new StringBuilder();
        boolean flag;
        for (int i = 0; i < files.size(); i++) {
            flag = false;
            String helper = "";
            for (int k = files.size() - 1; k > i; k--) {
                try {
                    if (compareFiles(files.get(i), files.get(k)) == 1) {
                        flag = true;
                        helper += files.get(k).toString() + "\r\n";
                        duplicateFiles.add(files.get(k));
                        files.remove(k);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (flag == true) {
                duplicatePaths.append(files.get(i).toString() + "\r\n" + helper);
                duplicatePaths.append("\r\n");
            }
        }
        files.clear();
        if (duplicateFiles.isEmpty()) {
            System.out.println("There are no duplicate files in this directory");
            return;
        } else {
            printResult(duplicateFiles, duplicatePaths.toString());
        }
    }

    public static void findFiles(Path path) {
        File directory = new File(path.toString());
        File[] fList = directory.listFiles();
        try {
            for (File file : fList) {
                if (file.isFile()) {
                    files.add(file);
                } else if (file.isDirectory()) {
                    findFiles(file.toPath());
                }
            }
        } catch (NullPointerException e) {
            System.err.println("Directory does not exist!");
        }
    }

    public static int compareFiles(File file1, File file2) throws Exception {

        BufferedReader BR1 = new BufferedReader(new FileReader(file1));
        BufferedReader BR2 = new BufferedReader(new FileReader(file2));

        String line1 = null;
        String line2 = null;
        int flag = 1;
        while ((flag == 1) && ((line1 = BR1.readLine()) != null) && ((line2 = BR2.readLine()) != null)) {
            if (!line1.equalsIgnoreCase(line2))
                flag = 0;
            else
                flag = 1;
        }
        BR1.close();
        BR2.close();
        return flag;

    }

    public static void printResult(List<File> duplicateFiles, String duplicatePaths) {
        System.out.println(duplicatePaths);
        System.out.println("A total of " + duplicateFiles.size() + " duplicate files can be deleted, freeing up "
                + sumMemory(duplicateFiles) + " megabytes disk space");
    }

    private static float sumMemory(List<File> duplicateFiles) {
        long memory = 0;
        for (File files : duplicateFiles) {
            memory += files.length();
        }
        return memory / (float) 1048576;
    }
}
