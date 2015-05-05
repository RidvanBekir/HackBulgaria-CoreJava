public class IsNPrime {

    public static void main(String[] args) {

        int number = 25;
        System.out.println("Is number prime: " + isPrime(number));

    }

    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
