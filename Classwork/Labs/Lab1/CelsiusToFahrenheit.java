/*
 * Problem Statement: Given the temperature in Celcius convert to Fahrenheit
 * 
 * @Author: Ryan Eubanks
 * @Date: 8/25/23
 */
package Classwork.Labs.Lab1;

import java.util.Scanner;


public class CelsiusToFahrenheit {

    public static void main(String[] args) {

        // Declare Variables
        float celsiusTemp;
        float fahrenheitTemp;
        Scanner in = new Scanner(System.in);

        // Get Celsuis Temperature
        System.out.print("Celsuis Temperature: ");
        celsiusTemp = in.nextFloat();

        // Calculations
        fahrenheitTemp = (celsiusTemp * 9/5) + 32;

        // Print Results
        System.out.print("\nFahrenheit Temperature is: " + fahrenheitTemp);
    }


}
