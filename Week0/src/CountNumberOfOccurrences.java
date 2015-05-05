public class CountNumberOfOccurrences {

    public static void main(String[] args) {

        System.out.println("The number of occurrences is: " + countOcurrences("da", "daaadaadadada"));

    }

    public static int countOcurrences(String needle, String haystack) {

        return (haystack.length() - haystack.replace(needle, "").length()) / needle.length();

    }
}
