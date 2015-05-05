public class Pow {

    public static void main(String[] args) {

        System.out.println("The result is: " + pow(2, 6));

    }

    public static double pow(int a, int b) {

        double result = 0;
        if (b == 0) {
            result = 1;
        }
        if(b == 1){
            result = a;
        }
        if (b != 0) {
            if (b % 2 == 0) {
                result = (Math.pow(a, b / 2) * Math.pow(a, b / 2));
            } else {
                result = (a * Math.pow(a, (b - 1) / 2) * Math.pow(a, (b - 1) / 2));
            }
        }

        return result;
    }
}
