public class MaxSpan {

    public static void main(String[] args) {

        int[] maxSpan = new int[] { 1, 4, 2, 1, 4, 4, 4 };
        System.out.println("The largest span found in the array is: " + maxSpan(maxSpan));

    }

    public static int maxSpan(int[] numbers) {

        int maxSpan = 0;
        int lastOne = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int k = 0; k < numbers.length; k++) {
                if (numbers[i] == numbers[k]) {
                    lastOne = k;
                }
                if (maxSpan < lastOne - i + 1) {
                    maxSpan = k - i + 1;
                }
            }
        }
        return maxSpan;
    }
}
