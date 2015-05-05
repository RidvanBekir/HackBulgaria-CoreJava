import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class GetOddOccurence {

    public static void main(String[] args) {

        int[] array = { 1, 1, 2, 2, 2, 1, 3, 4, 3, 4, 4, 6, 5, 5, 6, 5 };
        getOddOccurrence(array);

    }

    public static void getOddOccurrence(int[] array) {

        String arr = Arrays.toString(array);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            String str = array[i] + "";
            int occur = arr.length() - arr.replace(str, "").length();
            if (occur % 2 != 0) {
                numbers.add(Integer.parseInt(str));
            }
        }
        HashSet<Integer> hs = new HashSet<Integer>(numbers);
        numbers.clear();
        numbers.addAll(hs);
        System.out.println("The odd occurence numbers are:");
        for (int i : numbers) {
            System.out.print(i + "  ");
        }
    }
}
