public class RescaleImage {

    public static void main(String[] args) {

        int[][] original = new int[4][4];
        original = fillArray(original).clone();
        printArray(original);
        printArray(rescale(original, 8, 8));

    }

    public static int[][] rescale(int[][] original, int newWidth, int newHeight) {

        int[][] rescaled = new int[newWidth][newHeight];
        double x_ratio = original.length / (double) newWidth;
        double y_ratio = original[0].length / (double) newHeight;
        double px, py;
        for (int i = 0; i < newHeight; i++) {
            for (int j = 0; j < newWidth; j++) {
                px = Math.floor(j * x_ratio);
                py = Math.floor(i * y_ratio);
                rescaled[i][j] = original[(int) py][(int) px];
            }
        }
        return rescaled;
    }

    public static int[][] fillArray(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = (int) (Math.random() * 255 + 0);
            }
        }
        return array;
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + "    ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
