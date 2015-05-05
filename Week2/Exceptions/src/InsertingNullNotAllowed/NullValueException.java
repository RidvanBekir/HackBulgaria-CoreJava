package InsertingNullNotAllowed;

public class NullValueException extends RuntimeException {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private String message = "NullValueException : Null value found ! ";

    public NullValueException() {
    }
    public NullValueException(String message){
        this.message += "\n                     " + message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}