public class ReverseEachString {

    public static void main(String[] args) {

        String argument = new String("What is this");
        System.out.println("The reversed one is: " + reverseEveryChar(argument));

    }

    public static String reverseEveryChar(String arg) {

        String[] words = arg.split(" ");
        String reversedStr = "";
        for (int i = 0; i < words.length; i++) {

            reversedStr += " " + reverseMe(words[i]);

        }

        return reversedStr;
    }

    public static String reverseMe(String argument) {

        char[] currentArray = argument.toCharArray();
        char[] newArray = new char[currentArray.length];
        int j = newArray.length - 1;
        for (int i = 0; i < newArray.length; i++) {

            newArray[i] = currentArray[j];
            j--;

        }
        String newStr = new String(newArray);
        return newStr;
    }

}
