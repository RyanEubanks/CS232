package Classwork.Programming_Projects.PP5;

import java.util.ArrayList;
import java.util.Scanner;

public class PasswordManager {
    public static void main(String[] args) {
        // Declare Variables
        ArrayList<User> users = new ArrayList<>();
        String userName;
        String Enteredpassword;
        StringBuilder password;
        int option;
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("===== Login =====");
            System.out.println("[0] Login ");
            System.out.println("[1] Create account");
            System.out.println("[2] Exit\n");

            option = in.nextInt();

            if(option == 1) {
                System.out.println("Enter a username: ");
                userName = in.next();

                System.out.println("Enter a password: ");
                Enteredpassword = in.next();
                password = new StringBuilder(Enteredpassword);
                

                }


            

            if(option == 2) {

            }
        } while(option != 2);
    }

}
