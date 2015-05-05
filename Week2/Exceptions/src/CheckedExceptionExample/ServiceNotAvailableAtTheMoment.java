package CheckedExceptionExample;

public class ServiceNotAvailableAtTheMoment extends Exception{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    private String message = "ServiceNotAvailableAtTheMoment : Network connection gone down!";
    public ServiceNotAvailableAtTheMoment(){
    }
    @Override
    public String getMessage(){
        return message;
    }

}
