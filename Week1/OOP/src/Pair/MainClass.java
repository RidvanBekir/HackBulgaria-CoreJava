package Pair;
public class MainClass {

    public static void main(String[] args) {

        Pair pair1 = new Pair("name", 10);
        Pair pair2 = new Pair("surname", 10);

        System.out.println("The pairs are equal: " + pair1.equals(pair2));
        System.out.println(pair1.toString());
        System.out.println(pair2.toString());
        
    }
}
