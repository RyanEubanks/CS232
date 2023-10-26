package Classwork.Labs.Lab8;

import java.util.ArrayList;
import java.util.Scanner;

public class PasswordManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();

        while(true) {
            System.out.println("Password Manager Menu: ");
            System.out.println("1. Add User");
            System.out.println("2. Change Password");
            System.out.println("3. Check Password Strength");
            System.out.println("4. Display Users");
            System.out.println("5. Remove User");
            System.out.println("6. Exit");
            System.out.println("Enter your choice: ");
            
            int choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("Enter a username: ");
                    String username = sc.nextLine();
                    System.out.println("Enter a password");
                    String password = sc.nextLine();
                    users.add(new User(username, password));
                    System.out.println("User has been added.");
                    break;
                case 2:
                    System.out.println("Enter the username of the user whose password you want to change: ");
                    String userProvidedUsername = sc.nextLine();
                    boolean found = true;
                    for(User user: users) {
                        if(user.getUsername().equals(userProvidedUsername)) {
                            System.out.println("Enter a new password: ");
                            String newPassword = sc.nextLine();
                            user.changePassword(newPassword);
                            System.out.println("Password has been added.");
                            break;
                        }
                    }
                    if(!found) {
                        System.out.println("User not found.");
                    }
                    break;
                case 3:
                    System.out.println("Enter the username to check password strength: ");
                    String userNameToCheck = sc.nextLine();
                    boolean userfound = true;
                    for(User user: users) {
                        if(user.getUsername().equals(userNameToCheck)) {
                            String userPassword = user.getPassword().toString();
                            if(userPassword.ngth() >= 8 && userPassword.matches() ) {
                                
                            }
                        }
                    }
                    if(!found) {
                        System.out.println("User not found.");
                    }
                    break;
                case 4:

                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                default:
                    System.out.println("not an option");
            }
        }

    }
}
