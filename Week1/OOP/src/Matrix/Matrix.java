package Matrix;
import java.util.Random;

public class Matrix {

    public Pixel[][] matrix = new Pixel[5][5];
    
        public Matrix() {
        Random random = new Random();
        Pixel pixel;
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[0].length; j++) {
                pixel = new Pixel(random.nextFloat() , random.nextFloat(), random.nextFloat());
                this.matrix[i][j] = pixel;
            }
        }
    }

    public void operate(MatrixOperation op) {

        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[0].length; j++) {
                this.matrix[i][j] = op.withPixel(i, j, this.matrix);
            }
        }
    }

    public void showMatrix() {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                float sum;
                sum = (matrix[i][j].R + matrix[i][j].G + matrix[i][j].B);
                System.out.print(sum + "    ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
