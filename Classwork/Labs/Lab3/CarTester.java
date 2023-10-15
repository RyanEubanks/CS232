package Classwork.Labs.Lab3;

public class CarTester {
    public static void main(String[] args) {
        // function overloading
        System.out.println(mySquare(67));
        System.out.println(mySquare((float)9.8));

        // Create an object of type Car
        Car car1 = new Car("Honda"); // creating an object
        car1.printModel();
        // new is a keyword that helps allocate memory dynamically
        Car car2 = new Car("Toyota");
        car2.printModel();
    }
    // Calculate square of an integer
    public static int mySquare(int num) {
        int result = num * num;
        return result;
    }

    public static float mySquare(float num) {
        float result = num * num;
        return result;
    }
}
