/* 
* @Author Ryan Eubanks
* @Date: 9/15/2023
*/
package PP3;

import java.time.LocalDate;

public class Wedding {
    
    // Declare variables
    private Couple couple;
    private LocalDate weddingDate;
    private String location;

    // Constructor
    public Wedding(Couple couple, LocalDate weddingDate, String location) {
        this.couple = couple;
        this.weddingDate = weddingDate;
        this.location = location;
    }

    // Getters
    public Couple getCouple() {
        return this.couple;
    }

    public LocalDate getWeddingDate() {
        return this.weddingDate;
    }

    public String getLocation() {
        return this.location;
    }
}
