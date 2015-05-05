
public class AverageArray {

    public static void main(String[] args) {
        
        int[] array = { 5, 10, -25, 169, 23, 1, -2 };
        System.out.println("The average is: " + getAverage(array));
        
    }

    public static int getAverage(int[] array){
        int sum = 0;
        for(int i=0; i<array.length; i++){
            sum += array[i];
        }
        int result = sum/array.length;
        return result;
    }
}
