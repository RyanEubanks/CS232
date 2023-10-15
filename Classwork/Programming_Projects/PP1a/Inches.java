package PP1a;

import java.util.Scanner;

public class Inches {
    
    public static void main(String[] args) {

        // Declare Variables
        Scanner in = new Scanner(System.in);
        int inches;
        int feet;

        // Prompt User
        System.out.println("Enter inches: ");
        inches = in.nextInt();

        // Calculations
        feet = inches / 12;
        inches = inches % 12;

        // Print results
        System.out.println(feet + " ft " + inches + " in");
    }
}
