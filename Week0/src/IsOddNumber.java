public class IsOddNumber {

    public static void main(String[] args) {

        int n = 25;
        System.out.println("Is odd: " + isOdd(n));
        
    }

    public static boolean isOdd(int n) {

        if (n % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }
}
