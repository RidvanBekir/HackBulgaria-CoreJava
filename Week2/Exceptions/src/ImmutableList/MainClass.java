package ImmutableList;

import java.util.ArrayList;

public class MainClass {

    public static void main(String[] args) {
        
        try{
        ArrayList<Integer> array = new ArrayList<Integer>(2);
        array.add(12);
        array.add(15);
        ImmutableList<Integer> list = new ImmutableList<Integer>(array);
        System.out.println(list.get(1));
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}
