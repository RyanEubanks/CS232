/*
 * @Author: Ryan Eubanks
 * @Date: 9/10/23
 * CS232 section 1
 * This code takes the temperature and humidity from the user and uses them to calculate the heat index
 */

package PP2;

import java.util.Scanner;

public class HeatIndexCalculator {
    
    // Declare Variables
    private int currentTemp;
    private double currentHumidity;
    private double heatIndex;

    // Constant variables
    final static double c1 = -42.379;
    final static double c2 = 2.04901523;
    final static double c3 = 10.14333127;
    final static double c4 = -0.22475541;
    final static double c5 = -6.83783e-3;
    final static double c6 = -5.481717e-2;
    final static double c7 = 1.22874e-3;
    final static double c8 = 8.5282e-4;
    final static double c9 = -1.99e-6;

    // Default constructor
    public HeatIndexCalculator() {
    
    }

    // Method to get user input and store into variables
    public void getUserInput(Scanner in) {
        System.out.println("Enter temperature in degrees fahrenheit: ");
        this.currentTemp = in.nextInt();
        System.out.println("Enter humidity as a percentage: ");
        this.currentHumidity = in.nextDouble();
    }

    // this function calculates the heat index based off of the provided formula 
    public double calculateHeatIndex() {
        heatIndex = c1 + (c2 * currentTemp) + (c3 * currentHumidity) + (c4 * currentTemp * currentHumidity) 
        + (c5 * Math.pow(currentTemp,2)) + (c6 * Math.pow(currentHumidity, 2)) + (c7 * Math.pow(currentTemp, 2) * currentHumidity)
        + (c8 * currentTemp * Math.pow(currentHumidity, 2)) + (c9 * Math.pow(currentTemp, 2) * Math.pow(currentHumidity, 2));

        return heatIndex;
    }

    // this function displays information about the temperature, humidity and heatIndex
    public void printHeatIndex(double calculatedHeatIndex) {
        System.out.printf("When it is %dF and %.2f%%, it feels like %.2fF\n\n", currentTemp, currentHumidity, calculatedHeatIndex );
    }

}
