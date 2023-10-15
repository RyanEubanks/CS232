package Classwork.Labs.Lab2;
import java.util.Scanner;

public class length {
    
    public static void main(String[] args) {
        // Variables
        Scanner in = new Scanner(System.in);
        int feet;
        float inches;
        float centimeters;

        // Prompt User
        System.out.println("Enter feet: ");
        feet = in.nextInt();

        System.out.println("Enter inches: ");
        inches = in.nextFloat();

        // calculations
        inches += feet * 12;
        centimeters = inches * 2.54f;

        // Print results
        System.out.println("Centimeters: " + centimeters);

    }
}
