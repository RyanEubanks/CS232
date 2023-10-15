/*
 * Create a class named Person that holds the following fields: two String objects for the person’s first and last name
 * and a LocalDate object for the person’s birthdate. Create a class named Couple that contains two Person objects. 
 * Create a class named Wedding for a wedding planner that includes the date of the wedding, the names of the Couple 
 * being married, and a String for the location. Provide constructors for each class that accept parameters for each 
 * field, and provide get methods for each field. Then write a program that creates two Wedding objects and in turn 
 * passes each to a method that displays all the details. Save the files as Person.java, Couple.java, Wedding.java, 
 * and TestWedding.java. 
 * 
 * @Author Ryan Eubanks
 * @Date: 9/15/2023
 */
package PP3;

import java.time.LocalDate;

public class TestWedding {
    
    public static void main(String[] args) {
        // Create Objects
        Person person1 = new Person("Kris", "Mcanally", LocalDate.of(2003, 9, 13));
        Person person2 = new Person("Josh", "Hughs", LocalDate.of(2003, 7, 11));
        Person person3 = new Person("John", "Smith", LocalDate.of(2000, 6, 20));
        Person person4 = new Person("Amy", "Johnson", LocalDate.of(2004, 1, 4));

        Couple couple1 = new Couple(person1, person2);
        Couple couple2 = new Couple(person3, person4);

        Wedding wedding = new Wedding(couple1, LocalDate.of(2025, 7, 13), "Logan\'s house");
        Wedding wedding2 = new Wedding(couple2, LocalDate.of(2023, 9, 23), "CourtHouse");

        // call function to display wedding information
        displayWedding(wedding);
        displayWedding(wedding2);
    }

    // function to display wedding information
    public static void displayWedding(Wedding wedding) {
        System.out.println("Wedding information:");
        System.out.println("Person 1: " + wedding.getCouple().getPerson1().getFirstName() + " " + wedding.getCouple().getPerson1().getLastName() + " born on " + wedding.getCouple().getPerson1().getBirthday());
        System.out.println("Person 2: " + wedding.getCouple().getPerson2().getFirstName() + " " + wedding.getCouple().getPerson2().getLastName() + " born on " + wedding.getCouple().getPerson2().getBirthday());
        System.out.println("Location: " + wedding.getLocation());
        System.out.println("Wedding Date: " + wedding.getWeddingDate());
    }
}
