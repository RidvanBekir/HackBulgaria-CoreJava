import java.util.Arrays;


public class KthMinElement {

    public static void main(String[] args) {
        
        int[] array = { 5, 10, -25, 169, 23, 1, -2 };
        int k = 3;
        System.out.println("Kth min element is: " + kthMin(k,array));

               
    }

    public static int kthMin(int k, int[] array){
        
             Arrays.sort(array);
             return array[k-1];

    }         
}
