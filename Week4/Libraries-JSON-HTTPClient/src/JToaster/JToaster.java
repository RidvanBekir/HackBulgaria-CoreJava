package JToaster;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import com.nitido.utils.toaster.Toaster;

public class JToaster {

    public static void main(String[] args) {

        String path = new String("C:\\Users\\Ridvan\\Desktop\\boo.jpg");
        try {
            showImage(path, 1);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void showImage(String path, int minutes) throws IOException, InterruptedException {
        File file = new File(path);
        BufferedImage image = ImageIO.read(file);
        Toaster toaster = new Toaster();
        toaster.setBackgroundImage(image);
        toaster.setToasterHeight(image.getHeight());
        toaster.setToasterWidth(image.getWidth());
        toaster.setDisplayTime(minutes * 60000);
        toaster.showToaster("WTF");
    }
}
