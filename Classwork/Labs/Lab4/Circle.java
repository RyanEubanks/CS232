/*
 * @Author: Ryan Eubanks
 * @Date: 9/15/23
 */
package Classwork.Labs.Lab4;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class Circle {

    // Declare Variables
    private double radius;
    private String name;
    private double area;
    private LocalDate creationTime;

    // Constructor
    public Circle(double radius, String name) {
        this.radius = radius;
        this.name = name;
        this.creationTime = LocalDate.now();
        calcArea();
        printArea();
    }

    // Alternate constructor
    public Circle(double radius) {
        this.radius = radius;
        this.name = "noName";
        this.creationTime = LocalDate.now();
        calcArea();
        printArea();
    }

    // Alternate constructor
    public Circle(double radius, LocalDate cDate) {
        this.radius = radius;
        this.name = "noName";
        this.creationTime = cDate;
        calcArea();
        printArea();
    }

    // Function to calculate area
    public void calcArea() {
        this.area = Math.PI * Math.pow(radius, 2);
    }

    // Function to calculate area
    public void printArea() {
        DecimalFormat df = new DecimalFormat("##.##");
        System.out.println("The area of the circle " + this.name + " and birth time: " + this.creationTime + " is " + df.format(area));
    }
}
