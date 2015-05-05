public class PalindromeLengthAround {

    public static void main(String[] args) {

        String input = new String("t5daz*zad5d");
        System.out.println("The palindrome lenght is: " + getPalindromeLength(input));

    }

    public static int getPalindromeLength(String input) {

        char[] charArray = input.toCharArray();
        char c = '*';
        int position = 0;
        for (int i = 0; i < charArray.length; i++) {

            if (c == charArray[i]) {
                position = i;
            }
        }

        int counter = 0;
        for (int k = 1; k < charArray.length / 2; k++) {

            if (charArray[position - k] == charArray[position + k]) {
                counter++;
            }

        }
        return counter;
    }
}
