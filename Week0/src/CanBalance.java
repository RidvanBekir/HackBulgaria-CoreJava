public class CanBalance {

    public static void main(String[] args) {

        int[] numbers = new int[] { 1, 1, 1, 2, 1 };
        System.out.println("The array is balanced: " + canBalance(numbers));

    }

    public static boolean canBalance(int[] numbers) {
        int leftSum = 0;
        int rightSum = 0;
        boolean result = false;
        for (int i = 0; i < numbers.length; i++) {
            leftSum += numbers[i];
            for (int k = numbers.length - 1; k > i; k--) {
                rightSum += numbers[k];
            }
            if (leftSum == rightSum) {
                result = true;
            }
            rightSum = 0;
        }
        return result;
    }
}
