public class KthFactorial {

    public static void main(String[] args) {

        System.out.println("Kth factorial is: " + kthFac(2, 6));

    }

    public static long kthFac(int k, int n) {
        long result = n;
        do {
            result = result * (n - k);
            k += k;
        } while (k < n);
        return result;
    }
}
