package Matrix;
public class BrightnessReduce implements MatrixOperation {

    @Override
    public Pixel withPixel(int x, int y, Pixel[][] matrix) {
        // TODO Auto-generated method stub
        Pixel pixels = null;
        float R = matrix[x][y].R;
        float G = matrix[x][y].G;
        float B = matrix[x][y].B;
        float bright = R / 2 + G / 2 + B / 2;
        pixels = new Pixel(bright, bright, bright);
        return pixels;
    }
}
