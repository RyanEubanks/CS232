package Classwork.Labs.Lab9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Prog2 {
    public static void main(String[] args) {
        try {
            File myFile = new File("CS232\\Classwork\\Labs\\Lab1\\Rectangle.java");
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }   
        catch(FileNotFoundException e) {
            System.out.println("An error occured: " + e);
        }

        try {
            File myOtherFile = new File("file.txt");
            PrintStream ps = new PrintStream("myOtherFile");
            ps.println("Hey this is the first time I am writing into a file.");
        }
        catch(FileNotFoundException e) {
            System.out.println("An error occured:" + e);

        }
    }
}
