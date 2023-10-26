package Classwork.Labs.Lab9;
import java.util.Random;
public class Prog1 {
    public static void main(String[] args) {
        // Arrays are used to store multiple values in a single 
        // variable, instead of declaring separate variables for each value

        String[] names = {"Arup", "Will", "Shelby", "Bri"};

        System.out.println(names[2]);

        for(int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        // for each
        for(String name : names) {
            System.out.println(name);
        }

        int[] ages = new int[names.length];

        // for loop to populate ages array
        //use a for each loop to display all the elements
        Random rand = new Random();
        for(int i = 0; i < ages.length; i++ ) {
            ages[i] = rand.nextInt(20);
        }

        for(int age: ages) {
            System.out.println(age);
        }

        for(int i = 0; i < names.length; i++) {
            if(names[i] == "Shelby") {
                System.out.println("Shelby : 20th Century");
            } 
            else {
                System.out.println(names[i] + " : " + ages[i]);
            }
        }
        int[][][][][][][] age = new int[7][7][7][7][7][7][7];

        // Multidimensional array
        // is an array of arrays
        // 7 8 9 8 2
        // 7 6 5 4
        // 5 4 3

        int[][] numbers = {{7, 8, 9, 8, 2},
                            {7, 6, 5, 4}, 
                            {5, 4, 3}};
        System.out.println(numbers[1][2]);

        numbers[1][2] = 500;
        System.out.println(numbers[1][2]);

        for(int i = 0; i < numbers.length; i++) {
            for(int k = 0; k < numbers[i].length; k++) {
                System.out.println(numbers[i][k]);
            }
            System.out.println();
        }
    }
}
