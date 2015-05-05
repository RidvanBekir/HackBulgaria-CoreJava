public class CopyCharKTimes {

    public static void main(String[] args) {

        String input = new String("tldrk");
        int k = 5;
        System.out.println("The coppied one is: " + copyEveryChar(input, k));

    }

    public static String copyEveryChar(String input, int k) {

        char[] charArray = input.toCharArray();
        String coppiedStr = "";
        for (int i = 0; i < charArray.length; i++) {

            coppiedStr += "" + coppyKTimes(charArray[i], k);

        }
        return coppiedStr;
    }

    public static String coppyKTimes(char input, int k) {
        String coppiedChar = "";
        for (int j = 0; j < k; j++) {
            coppiedChar += input;
        }
        return coppiedChar;

    }
}
