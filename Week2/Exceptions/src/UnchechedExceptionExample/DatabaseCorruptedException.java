package UnchechedExceptionExample;

public class DatabaseCorruptedException extends RuntimeException{
    
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    String message = "DatabaseCorruptedException : Entered invalid username or password!";
    public DatabaseCorruptedException(){
    }
    @Override
    public String getMessage(){
        return message;
    }

}
