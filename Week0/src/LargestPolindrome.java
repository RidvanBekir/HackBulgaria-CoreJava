public class LargestPolindrome {

    public static void main(String[] args) {

        long number = 500;
        System.out.println("Largest polindrome is: " + getLargestPolindrome(number));
    }

    public static long getLargestPolindrome(long N) {
        long i = 0;
        for (i = N; i > 0; i--) {
            if (isPolindrome(i) == true) {
                return i;
            }
        }
    return 0;
    }

    public static boolean isPolindrome(long n) {

        String str = Long.toString(n);
        char[] charArray = str.toCharArray();
        int j = charArray.length - 1;
        for(int i=0; i<charArray.length/2; i++){
            
                if(charArray[i] != charArray[j]){
                return false;
            }
            j--;
        }
        
        return true;
    }
}
