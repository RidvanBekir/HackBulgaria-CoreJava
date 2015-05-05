import java.util.ArrayList;

public class SumNumbersInString {

    public static void main(String[] args) {

        String input = new String("abc123dd34");
        System.out.println("The sum of numbers in the string is: " + sumOfNumbers(input));

    }

    public static int sumOfNumbers(String input) {

        String digitStr = "";
        ArrayList<Integer> digits = new ArrayList<Integer>();
        int sum = 0;

        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                digitStr += input.charAt(i);
            } else {
                if (!digitStr.isEmpty()) {
                    digits.add(Integer.parseInt(digitStr));
                    digitStr = "";
                }
            }
        }
        if (!digitStr.isEmpty()) {
            digits.add(Integer.parseInt(digitStr));
            digitStr = "";
        }

        for (Integer i : digits) {
            sum += i;
        }
        return sum;
    }
}
