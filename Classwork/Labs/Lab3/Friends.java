package Classwork.Labs.Lab3;

public class Friends {
    // Declare Variables
    private String firstName;
    private String lastName;

    public static int totalFriends = 0; // class variable

    // Constructor
    public Friends(String first, String last) {
        this.firstName = first;
        this.lastName = last;
        totalFriends++; // post-increment
    }
    /* Case 1:
     * y = 5;
     * x = y++; // x = y; y = y + 1;
     * x and y will be 5 and 6 respectively.
     * 
     * Case 2:
     * y = 5;
     * x = ++y; // y = y + 1; x = y;
     * Both x and y will be 6.
     */

    //getters
    public String getFistName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public static void printInformation() {
        System.out.println("Info");
    }

    //setters
    public void setFirstname(String fName) {
        this.firstName = fName;
    }
}
