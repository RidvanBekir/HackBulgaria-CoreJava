package Matrix;
public class Greyscale implements MatrixOperation {


    @Override
    public Pixel withPixel(int x, int y, Pixel[][] matrix) {
        // TODO Auto-generated method stub
        float R = matrix[x][y].R;
        float G = matrix[x][y].G;
        float B = matrix[x][y].B;
        float grey = ((R + G + B) / 3) / 3;
        Pixel pixels = new Pixel(grey, grey, grey);
        return pixels;
    }
}
