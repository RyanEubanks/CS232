/*
 * @Author: Ryan Eubanks
 * @Date: 9/15/23
 * 
 */
package Classwork.Labs.Lab4;

import java.time.LocalDate;

public class ShapesTester {
    
    public static void main(String[] args) {

        // Creating circle objects
        Circle circle1 = new Circle(5.6, "Sonia");
        Circle circle2 = new Circle(6.2);
        Circle circle3 = new Circle(6.2, LocalDate.of(2021, 9, 25));

        // Creating square objects
        Square square1 = new Square(5.6, "Kris");
        Square square2 = new Square(6.2);
    }
}
