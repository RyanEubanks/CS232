package Classwork.Programming_Projects.PP5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PasswordManager {
    public static void main(String[] args) {
        // Declare Variables
        String userName;
        int option;
        Scanner in = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();
        boolean foundUser = false;

        // main menu
        do {
            System.out.println("===== Login =====");
            System.out.println("[0] Add User");
            System.out.println("[1] Change User Password");
            System.out.println("[2] Check Password Strength");
            System.out.println("[3] Display Users");
            System.out.println("[4] Remove User");
            System.out.println("[5] Exit\n");

            option = in.nextInt();
            
            // user options
            switch(option) {
                case 0:
                    users.add(createUser());
                    break;
            
                case 1:
                    do {
                        
                        System.out.println("Enter a username to change the password: ");
                        userName = in.next();
                        for(User user : users) {
                            if(user.getUserName().equals(userName)) {
                                user.changePassword();
                                foundUser = true;
                            }
                        }

                    } while(foundUser != true);
                    break;
                
                    case 2:
                        do {
                        
                        System.out.println("Enter a username to check password strength: ");
                        userName = in.next();
                        for(User user : users) {
                            if(user.getUserName().equals(userName)) {
                                user.checkPasswordStrength(user.getPassWord());
                                foundUser = true;
                            }
                        }

                    } while(foundUser != true);
                    break;

                    case 3:
                        for(User user : users) {
                            System.out.println(user.toString());
                        }
                        break;
                    
                    case 4:
                        do {
                        
                            System.out.println("Enter a username to REMOVE USER: ");
                            userName = in.next();
                            
                            Iterator<User> iterator = users.iterator();
                            while (iterator.hasNext()) {
                                User user = iterator.next();
                                if (user.getUserName().equals(userName)) {
                                    iterator.remove();
                                    System.out.println("User removed successfully.");
                                    foundUser = true;
                                    break;
                                }
                            }

                    } while(foundUser != true);
                    break;

                    case 5:
                        continue;
                        
                    default:
                        System.out.println("Invalid input");


            }
        } while(option != 5);
    }

    // function that creates a user
    public static User createUser() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter user name: ");
        String userName = in.next();

        System.out.println("Enter password: ");
        String initialPassword = in.next();
        StringBuilder password = new StringBuilder(initialPassword);
        return new User(userName, password);
    }

}
