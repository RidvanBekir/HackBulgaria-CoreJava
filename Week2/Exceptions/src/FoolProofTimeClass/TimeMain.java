package FoolProofTimeClass;

public class TimeMain {

    public static void main(String[] args) {
        try{
            Time time = new Time(5,29,40);
            System.out.println(time.toString());
        }
        catch(IllegalArgumentException e){
            e.printStackTrace();
        }
    }
}
