/*
 * @Author: Ryan Eubanks
 * @Date: 9/15/23
 * 
 */
package Classwork.Labs.Lab4;

public class Square {
    // Declare variables
    private double sideLength;
    private String name;
    private double area;

    // Constructor
    public Square(double sideLength) {
        this.sideLength = sideLength;
        this.name = "NoName";
        calcArea();
        printArea();
    }

    // alternate constructor
    public Square(double sideLength, String name) {
        this.name = name;
        this.sideLength = sideLength;
        calcArea();
        printArea();
    }

    // Function to calculate the area
    public void calcArea() {
        this.area = sideLength * sideLength;
    }

    // Function to print the area
    public void printArea() {
        System.out.printf("The area of the square %s is %.2f", this.name, this.area);
    }
}