package Classwork.Labs.Scholarship;

import java.util.Scanner;

public class ScholarshipEligibilityTester {
    
    public static void main(String[] args) {
        // declare variables
        float gpa;
        int sat;
        Scanner in = new Scanner(System.in);

        // Get inputs
        System.out.println("Enter gpa: ");
        gpa = in.nextFloat();

        System.out.println("Enter SAT score: ");
        sat = in.nextInt();

        // implement logic for scholarship: gpa >= 3.5 and >= 1500
        if(gpa >= 3.5  && sat >= 1500) {
            System.out.println("Student is eligible for the scholorship.");
        }
        else {
            System.out.println("Student is NOT eligible for the scholarship.");
        }


        in.close();
    }
}
