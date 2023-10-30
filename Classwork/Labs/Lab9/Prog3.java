package Classwork.Labs.Lab9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Prog3 {
    public static void main(String[] args) {
        
        try {
            // open input and output files
            Scanner sc = new Scanner(new File("CS232\\Classwork\\Labs\\Lab9\\Prog3.txt"));
            PrintStream ps = new PrintStream(new File("output.txt"));

            ArrayList<Integer> numbers = new ArrayList<>();
            // cannot use int with arraylist since its a primitive type

            // process each line of the text from the file
            while (sc.hasNextLine()) {
                String line = sc.nextLine(); // 8 9 7 3
                Scanner lineScanner = new Scanner(line);
                int product = 1;

                // Clear the ArrayList for each new line
                numbers.clear();

                while (lineScanner.hasNextInt()) {
                    int number = lineScanner.nextInt();
                    numbers.add(number);
                    product *= number;
                }

                int sum = 0;
                for (int num : numbers) {
                    sum += num;
                }

                ps.println("Product: " + product + " " + "Sum: " + sum);
            }
            
            // Close resources
            sc.close();
            ps.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}