/* 
* @Author Ryan Eubanks
* @Date: 9/15/2023
*/
package PP3;

import java.time.LocalDate;

public class Couple {
    
    // Daclare variables
    private Person person1;
    private Person person2;

    // Constructors
    public Couple(Person person1, Person person2) {
        this.person1 = person1;
        this.person2 = person2;
    }
    
    // Getters
    public Person getPerson1() {
        return this.person1;
    }

    public Person getPerson2() {
        return this.person2;
    }
}
