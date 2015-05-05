package ReduceFilePath;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ReduceFilePath {

    public static String reduce_file_path(Path path) {
        return path.normalize().toString();
    }

    public static void main(String[] args) {
        Path path = Paths.get("/home//radorado/code/./hackbulgaria/week0/../");
        System.out.println(reduce_file_path(path));
    }
}
