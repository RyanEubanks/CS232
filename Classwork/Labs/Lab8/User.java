package Classwork.Labs.Lab8;

public class User {
    private String username;
    private StringBuilder password;

    public User(String username, String Password) {
        this.username = username;
        this.password = new StringBuilder(password);
    }

    public String getUsername() {
        return username;
    }
    public StringBuilder getPassword() {
        return password;
    }

    public void changePassword(String newPassword) {
        this.password = new StringBuilder(newPassword);
    }
}
