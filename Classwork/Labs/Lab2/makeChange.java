package Classwork.Labs.Lab2;
import java.util.Scanner;

public class makeChange {
    
    public static void main(String[] args) {
        // declare variables
        Scanner in = new Scanner(System.in);
        int halfDollar;
        int quarter;
        int dime;
        int nickel;
        int pennie;
        int cents;

        // prompt user
        System.out.println("Enter cents: ");
        cents = in.nextInt();

        // calculations
        halfDollar = cents / 50;
        cents = cents % 50;

        quarter = cents / 25;
        cents = cents % 25;

        dime = cents / 10;
        cents = cents % 10;

        nickel = cents / 5;
        cents = cents % 5;

        pennie = cents;

        // print results
        System.out.println("You have: " + halfDollar + " half dollars " + quarter + " quarters " + dime + " dimes " + nickel + " nickels " + pennie + " pennies");

    }
}
