package PP1b;

import java.util.Scanner;

public class sphere {
    
    public static void main(String[] args) {
        // Declare variables
        Scanner in = new Scanner(System.in);
        float radius;
        float diameter;
        float circumference;
        float surface_area;
        float volume;
        float pi = 3.1415f;

        // Prompt user
        System.out.println("Enter radius: ");
        radius = in.nextFloat();

        // Calculations
        diameter = 2 * radius;
        circumference = 2 * pi * radius;
        surface_area = 4 * pi * (float)Math.pow(radius, 2);
        volume = 4/3 * pi * (float)Math.pow(radius, 3);

        // Print results
        System.out.println("diameter: " + diameter);
        System.out.println("circumference: " + circumference);
        System.out.println("surface area: " + surface_area);
        System.out.println("volume: " + volume);
    }
}
