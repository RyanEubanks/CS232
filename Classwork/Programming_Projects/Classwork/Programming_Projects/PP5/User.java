package Classwork.Programming_Projects.PP5;

public class User {
    private String userName;
    private StringBuilder password;
    
    public User(String userName, StringBuilder password) {
        this.userName = userName;
        this.password = password;

    }

    public void changePassword(StringBuilder newPass) {
        this.password = newPass;
    }

}
