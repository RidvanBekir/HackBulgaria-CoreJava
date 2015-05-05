import java.util.Arrays;

public class MaximalScalarProduct {

    public static void main(String[] args) {

        int[] a = { 3, 20, 15 };
        int[] b = { 30, 42, 7 };
        System.out.println("The largest possible scalar product is: " + maximalScalarSum(a, b));
    }

    public static long maximalScalarSum(int[] a, int[] b) {

        Arrays.sort(a);
        Arrays.sort(b);
        long sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i] * b[i];
        }
        return sum;
    }
}
