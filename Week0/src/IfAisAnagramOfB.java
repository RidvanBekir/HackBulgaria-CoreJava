public class IfAisAnagramOfB {

    public static void main(String[] args) {

        String A = new String("silent");
        String B = new String("listen");
        System.out.println("A is anagram of B: " + anagram(A, B));

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
