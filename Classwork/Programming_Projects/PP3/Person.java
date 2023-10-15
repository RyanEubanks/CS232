/* 
* @Author Ryan Eubanks
* @Date: 9/15/2023
*/
package PP3;

import java.time.LocalDate;

public class Person {
    
    // Declare variables
    private String firstName;
    private String lastName;
    private LocalDate birthdate;

    // constructor
    public Person(String firstName, String lastName, LocalDate birthdate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = birthdate;
    }

    // Getters
    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public LocalDate getBirthday() {
        return this.birthdate;
    }

}