/*
 * Problem Statement: Print hello world and a little bit of information about yourself
 * 
 * @Author: Ryan Eubanks
 * @Date: 8/23/23
 * 
 */
package Classwork.Labs.Lab1;
import javax.swing.JOptionPane; //Swing GUI

public class HelloWorld {

    public static void main(String[] args) { // main method

        System.out.println("Hello, World!"); //Printing hello world
        System.out.println("I like to climb"); // more information
        System.out.println("I like to run");
        System.out.println("Programming is fun");
        System.out.println("I have a dog");
        System.out.println("I know a little bit of java");

        JOptionPane.showMessageDialog(null, "Hello, World"); //gui dialog box
        
        

    }
}