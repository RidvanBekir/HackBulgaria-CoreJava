public class IsNumberPalindrome {

    public static void main(String[] args) {

        int number = 1234321;
        System.out.println("Is the number palindrome: " + isPalindrome(number));

    }

    public static boolean isPalindrome(int argument) {

        String str = Integer.toString(argument);
        char[] charArray = str.toCharArray();
        int j = charArray.length - 1;
        for (int i = 0; i < charArray.length / 2; i++) {

            if (charArray[i] != charArray[j]) {
                return false;
            }
            j--;
        }
        return true;
    }
}
