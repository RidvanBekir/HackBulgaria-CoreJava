public class GrayscaleImageHistogram {

    public static void main(String[] args) {

        short[][] matrix = new short[100][100];
        int pixel = 25;
        int[] image = histogram(fillArray(matrix)).clone();
        System.out.println("The number of pixel: " + pixel + " occurred in the array is: " + image[pixel]);
    }

    public static int[] histogram(short[][] image) {

        int[] array = new int[image.length * image[0].length];
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                array[image[i][j]] += 1;
            }
        }
        return array;
    }

    public static short[][] fillArray(short[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (short) (Math.random() * 255 + 0);
            }
        }
        return matrix;
    }
}
