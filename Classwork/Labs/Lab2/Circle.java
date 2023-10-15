package Classwork.Labs.Lab2;
import java.util.Scanner;

public class Circle {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float radius;
        float diameter;
        float area;
        float pi = 3.1415f;

        // Prompt user
        System.out.println("Enter a radius: ");
        radius = in.nextFloat();

        // Calculations
        diameter = 2 * radius;
        area = 2 * pi * radius;

        // print results
        System.out.println("diameter: " + diameter);
        System.out.println("area: " + area);
    }
}
