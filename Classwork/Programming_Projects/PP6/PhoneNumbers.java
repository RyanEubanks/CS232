/*
 * @Author: Ryan Eubanks
 * @Date: 10/29/23
 * Problem Statement:
 * Create a program that is a phone directory and uses an array to store names, numbers, and addresses.
 */
package Classwork.Programming_Projects.PP6;

import java.util.Scanner;

public class PhoneNumbers {
    public static void main(String[] args) {
        // declare variables
        Scanner in = new Scanner(System.in);
        Contact[] contacts = new Contact[5];

        // add two contacts to the array
        contacts[0] = new Contact("Ryan Eubanks", "312 Gunnells Rd", "256-454-0619");
        contacts[1] = new Contact("Josh Hughs", "Somewhere Pleasant valley Rd", "256-676-8178");

        // indicate that we have already added two contacts to the array
        int index = 2;

        // logic for contact lookup and creation
        while (true) {
            System.out.print("Enter a name or quit to exit: ");
            String input = in.nextLine();

            if (input.equalsIgnoreCase("quit")) {break;}

            boolean found = false;
            for (int i = 0; i < index; i++) {
                if (contacts[i].getName().equalsIgnoreCase(input)) {
                    found = true;
                    System.out.println(contacts[i]);
                    break;
                }
            }

            if (found == false) {
                if (index < 5) {
                    System.out.print("Enter address: ");
                    String address = in.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = in.nextLine();

                    contacts[index] = new Contact(input, address, phoneNumber);
                    index++;
                } else {
                    System.out.println("Array is full.");
                }
            }
        }
    }
}
