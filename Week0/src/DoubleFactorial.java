public class DoubleFactorial {

    public static void main(String[] args) {

        int n = 4;
        System.out.println("Doubled factorial is: " + doubleFac(n));

    }

    public static double doubleFac(int n) {

        return factorial(factorial(n));

    }

    public static double factorial(double d) {
        double number = 1;
        for (double i = d; i > 1; i--) {
            number = number * i;
            }
        return number;
    }
}
