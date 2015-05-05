public class ReverseString {

    public static void main(String[] args) {

        String argument = "Reverse";
        System.out.println("The reversed string is: " + reverseMe(argument));

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
