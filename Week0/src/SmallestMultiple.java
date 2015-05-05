import java.util.ArrayList;

public class SmallestMultiple {

    public static void main(String[] args) {

        int upperBound = 7;
        System.out.println("Smallest multiple from 1 to " + upperBound + " is: " + getSmallestMultiple(upperBound));

    }

    public static int getSmallestMultiple(int upperBound) {

        ArrayList<Integer> multiples = new ArrayList<Integer>();
        int flag = 0;
        int[] numbers = new int[upperBound];
        int smallestMultiple = 1;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        int j = 2;
        while (j <= upperBound) {
            for (int k = 0; k < numbers.length; k++) {
                if (numbers[k] % j == 0) {
                    numbers[k] = numbers[k] / j;
                    flag = 1;
                }
            }
            if (flag == 1) {
                multiples.add(j);
                j = j - 1;
            }
            j = j + 1;
            flag = 0;
        }
        for (int number : multiples) {
            smallestMultiple = smallestMultiple * number;
        }
        return smallestMultiple;
    }
}
