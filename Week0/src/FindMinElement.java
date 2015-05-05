public class FindMinElement {

    public static void main(String[] args) {

        int[] array = { 5, 10, -25, 169, 23, 1, -2 };
        System.out.println("The minimum element is: " + min(array));

    }

    public static int min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

}
