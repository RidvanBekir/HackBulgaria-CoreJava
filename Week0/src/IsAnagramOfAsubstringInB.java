import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IsAnagramOfAsubstringInB {

    public static void main(String[] args) {

        String A = new String("listen");
        String B = new String("Listen! John.");
        System.out.println("Is anagram of A is a substring in B: " + hasAnagramOf(A.toLowerCase(), B.toLowerCase()));

    }

    public static boolean hasAnagramOf(String A, String B) {

        boolean result = false;
        ArrayList<String> arr = new ArrayList<String>();
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(B);
        while (matcher.find()) {
            arr.add(matcher.group());
        }
        for (int i = 0; i < arr.size(); i++) {
            if (anagram(A, arr.get(i)) == true) {
                result = true;
            }
        }
        return result;
    }

    public static boolean anagram(String A, String B) {

        if (B.length() != A.length()) {
            return false;
        }
        char[] chars = B.toCharArray();
        for (char c : chars) {
            int index = A.indexOf(c);
            if (index != -1) {
                A = A.substring(0, index) + A.substring(index + 1, A.length());
            } else {
                return false;
            }
        }
        return A.isEmpty();
    }
}
