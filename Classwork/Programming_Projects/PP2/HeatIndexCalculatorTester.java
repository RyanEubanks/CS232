/*
 * @Author: Ryan Eubanks
 * @Date: 9/10/23
 * CS232 section 1
 * This code takes the temperature and humidity from the user and uses them to calculate the heat index
 */
package PP2;

import java.util.Scanner;

public class HeatIndexCalculatorTester {
    
    public static void main(String[] args) {
        // Declare Varibles
        Scanner in = new Scanner(System.in);
        
        // Create first object
        HeatIndexCalculator temp1 = new HeatIndexCalculator();
        // Getting the Temperature and humidity from the user
        temp1.getUserInput(in);
        // Printing the calculated heat index
        temp1.printHeatIndex(temp1.calculateHeatIndex());
        
        HeatIndexCalculator temp2 = new HeatIndexCalculator();
        temp2.getUserInput(in);
        temp2.printHeatIndex(temp2.calculateHeatIndex());

        HeatIndexCalculator temp3 = new HeatIndexCalculator();
        temp3.getUserInput(in);
        temp3.printHeatIndex(temp3.calculateHeatIndex());
        
    }

}
