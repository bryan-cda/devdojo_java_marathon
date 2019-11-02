package beans;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Authentication {
    private String user;
    private String password;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean apiAccess(String user, String password){
        if(user.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")){
            return true;
        } else{
            return false;
        }
    }
}
