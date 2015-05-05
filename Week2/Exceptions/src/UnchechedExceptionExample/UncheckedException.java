package UnchechedExceptionExample;

public class UncheckedException {

    public static void main(String[] args) {
        try{
            @SuppressWarnings("unused")
            Users user = new Users("","1fd2fdf56");
        }
        catch(DatabaseCorruptedException e){
            System.err.println(e.getMessage());
        }
    }
}
