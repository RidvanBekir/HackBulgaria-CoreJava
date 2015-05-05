
public class IsStingPolindrome {

    public static void main(String[] args) {
        
        String argument = new String("argtatgra");
        System.out.println("Is the argument palindrome: " + isPalindrome(argument));

    }
    
    public static boolean isPalindrome(String argument){
        
        char[] charArray = argument.toCharArray();
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
