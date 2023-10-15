/*
 * Problem Statement:
 * Create a java project (ManageFriends) That uses two source files:
 * ManageFriends.java and Friends.java
 * Friends.java has two private string varibales: firstName and LastName and following Methods:
 * Friends(String fisrt, String last) // constuctor
 * printInformation() // A static method that explains what Friends class does
 * Include your test code in manageFriends.java class
 * -create three Friend instances. Also, implement your program
 * in such a way so that each instance can remember
 * how many instances of friends class you have already created
 * (Hint: you have to use a static variable)
 * 
 * @Author: Ryan Eubanks
 * @Date: 9/8/23
 */

package Classwork.Labs.Lab3;

public class ManageFriends {
    
    public static void main(String[] args) {
        // Instantiate three objects of class Friends
        Friends friend1 = new Friends("John", "Smith");
        Friends friend2 = new Friends("Caleb", "Pack");
        Friends friend3 = new Friends("William", "Hughes");

        friend1.setFirstname("Ash");
        System.out.println("My friends are: ");
        System.out.println(friend1.getFistName() + " " +friend1.getLastName());

        // Print out the total number of friends
        System.out.println("Total number of friends: " + Friends.totalFriends);
        // Call static method, printInformation;
        Friends.printInformation();
    }
}
