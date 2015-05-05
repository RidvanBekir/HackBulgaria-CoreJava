package CheckedExceptionExample;

public class ChechedExceptionMain {

    public static void main(String[] args) {
        
        try{
            useService();
        }
        catch(ServiceNotAvailableAtTheMoment e){
            System.err.println(e.getMessage());
        }
    }
    
    public static void useService() throws ServiceNotAvailableAtTheMoment{
        throw new ServiceNotAvailableAtTheMoment();
    }
}
