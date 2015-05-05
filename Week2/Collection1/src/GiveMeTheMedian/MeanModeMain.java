package GiveMeTheMedian;

public class MeanModeMain {

    public static void main(String[] args) {
        MeanMode test = new MeanMode();
        test.add(2);
        test.add(2);
        test.add(1);
        test.add(2); 
        test.add(5);
        test.add(5);
        test.add(3);
        test.add(4);
        test.add(3);
        test.add(6);
        System.out.println(test.toString());
        System.out.println("The mean is: " + test.getMean());
        System.out.println("The median is: " + test.getMedian());
        System.out.println("The mode is: " + test.getMode());
        System.out.println("The range is : " + test.getRange());
    }
}
