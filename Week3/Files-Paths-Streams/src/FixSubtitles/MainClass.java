package FixSubtitles;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MainClass {

    public static void main(String[] args) {

        Path path = Paths.get("C:\\Users\\Ridvan\\Desktop\\lost.s04e11.hdtv.xvid-2hd.srt");

        try {

            FixSubtitles.fixEncoding(path);

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
