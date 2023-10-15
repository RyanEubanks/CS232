/*
 * @Author: Ryan Eubanks
 * @Date: 10/2/2023
 * 
 * Problem statement:
 * Create cube class and use it to compare volumes with the user
 */
package Classwork.Labs.CubeProject;

import java.util.Scanner;

public class CubeTester {
    
    public static void main(String[] args) {

        // Variables
        float userVolume;
        // Create objects
        Cube cube1 = new Cube(2,3,4);
        Cube cube2 = new Cube(5,1,3);
        Cube cube3 = new Cube(7,2,5);
        Cube cube4 = new Cube(8,9,4);

        Scanner in = new Scanner(System.in);
        // Prompt user
        System.out.println("Enter a volume to compare: ");
        userVolume = in.nextFloat();

        // Logic
        if(userVolume < cube1.getVolume()) {
            System.out.println("cube1's volume is greater than user volume:");
            System.out.println("Length: " + cube1.getLength() + "\nWidth: " + cube1.getWidth() + "\nHeight: + " + cube1.getHeight() + "\nVolume: " + cube1.toString());
        }
        if(userVolume < cube2.getVolume()) {
            System.out.println("cube2's volume is greater than user volume:");
            System.out.println("Length: " + cube2.getLength() + "\nWidth: " + cube2.getWidth() + "\nHeight: + " + cube2.getHeight() + "\nVolume: " + cube2.toString());
        }
        if(userVolume < cube3.getVolume()) {
            System.out.println("cube3's volume is greater than user volume:");
            System.out.println("Length: " + cube3.getLength() + "\nWidth: " + cube3.getWidth() + "\nHeight: + " + cube3.getHeight() + "\nVolume: " + cube3.toString());
        }
        if(userVolume < cube4.getVolume()) {
            System.out.println("cube4's volume is greater than user volume:");
            System.out.println("Length: " + cube4.getLength() + "\nWidth: " + cube4.getWidth() + "\nHeight: + " + cube4.getHeight() + "\nVolume: " + cube4.toString());
        }
        
    }
}
