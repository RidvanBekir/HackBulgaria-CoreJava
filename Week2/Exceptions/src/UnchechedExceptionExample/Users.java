package UnchechedExceptionExample;

public class Users {
    private String username = null;
    private String password = null;
    
    public Users(String username,String password) throws RuntimeException{
        if(username == "" || password.length() < 6){
            throw new DatabaseCorruptedException();
        }
        else{
            this.setUsername(username);
            this.setPassword(password);
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
