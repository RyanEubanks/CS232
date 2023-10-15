package Classwork.Labs.Lab3;

public class Car {  // Blueprint // abstract data type

    // Attributes
    private String model;

    // Constructor --> helping to initialize attributes
    public Car(String model) {
        this.model = model; // this keyword refers to the current object
    }

    public void printModel() {
        System.out.println("The model of the car is: " + model);
    }
    
}
