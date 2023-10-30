package Classwork.Programming_Projects.PP6;

public class Contact {
    // declare variables
    private String name;
    private String address;
    private String phoneNumber;

    // constructor
    public Contact(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;

    }
    
    // getters
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String phoneNumber() {
        return phoneNumber;
    }

    // toString function
    @Override
    public String toString() {
        return "Name: " + name + "\nAddress: " + address + "\nPhone Number: " + phoneNumber;
    }
}
