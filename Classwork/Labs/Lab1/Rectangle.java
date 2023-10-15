/*
 * Problem Statemnet: Given the length and width of the rectagle, your java program should
 * compute and output the perimeter and the area of the rectangle
 * 
 *  @Author: Ryan Eubanks
 *  @Date: 8/23/23
 */

package Classwork.Labs.Lab1;
import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Step 1: Declare Variables
        float length;
        float width;
        float area;
        float perimeter;

        // Step 2: Prompt user
        System.out.println("Enter a length: "); // ask user for length
        length = in.nextFloat(); //save length value

        System.out.println("Enter a width: "); //ask user for width
        width = in.nextFloat();
        System.out.println();

        // Step 3: Calculations
        perimeter = (2 * length) + (2 * width); // perimeter calculations
        area = length * width; // area calculations

        // Step 4: Print results
        System.out.println("Perimeter is: " + perimeter);
        System.out.println("Area is: " + area);

    }
}
