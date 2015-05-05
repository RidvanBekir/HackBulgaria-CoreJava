package FixSubtitles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FixSubtitles {

    public static void fixEncoding(Path path) throws UnsupportedEncodingException, FileNotFoundException, IOException {

        File file = path.toFile();

        byte[] encoded = Files.readAllBytes(Paths.get(file.getAbsolutePath()));
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(new File("encoded.txt")), "UTF-8"))) {

            bw.write(new String(encoded, "Windows-1251"));

        }
    }
}
