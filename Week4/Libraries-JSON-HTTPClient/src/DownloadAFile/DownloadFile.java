package DownloadAFile;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class DownloadFile {

    public static void main(String[] args) {

        String url = new String("http://d3dsacqprgcsqh.cloudfront.net/photo/aozrdx0_700b.jpg");
        try {
            downloadFile(url);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void downloadFile(String url) throws IOException {
        URL URL = new URL(url);
        InputStream in = new BufferedInputStream(URL.openStream());
        OutputStream out = new BufferedOutputStream(new FileOutputStream("download.jpg"));
        for (int i; (i = in.read()) != -1;) {
            out.write(i);
        }
        System.out.println("File saved to project directory !");
        in.close();
        out.close();
    }
}
