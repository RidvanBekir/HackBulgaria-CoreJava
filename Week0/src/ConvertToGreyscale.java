import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ConvertToGreyscale {

    public static void main(String[] args) {

        String imgPath = "C:\\Users\\Ridvan\\Desktop\\IMG_4480.jpg";
        convertToGreyscale(imgPath);
        System.out.println("The image is converted to greyscale!");

    }

    public static void convertToGreyscale(String imgPath) {

        try {
            BufferedImage image = ImageIO.read(new File(imgPath));
            int width = image.getWidth();
            int height = image.getHeight();

            for (int i = 0; i < height; i++) {
                for (int k = 0; k < width; k++) {
                    Color c = new Color(image.getRGB(k, i));
                    int red = (int) (c.getRed());
                    int green = (int) (c.getGreen());
                    int blue = (int) (c.getBlue());
                    int grey = (int) ((red + green + blue) / 3);
                    Color newColor = new Color(grey, grey, grey);
                    image.setRGB(k, i, newColor.getRGB());
                }
            }
            ImageIO.write(image, "jpg", new File("C:\\Users\\Ridvan\\Desktop\\mypic_new.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
