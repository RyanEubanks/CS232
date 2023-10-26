package Classwork.Labs.Lab8;
import java.util.ArrayList;

public class ArrayListLength {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        String name = "John";
        String name2 = "Sam";
        String name3 = "Matthew";
        String longest = "";
        arr.add(name);
        arr.add(name2);
        arr.add(name3);

        for(String test : arr) {
            if(test.length() > longest.length()) {
                longest = test;
            }
        }
        System.out.println(longest + " is the largest");
    }
}
