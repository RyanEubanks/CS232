package Classwork.Labs.Lab5;

import java.util.Scanner;

public class MoreLoopExamples {
    public static void main(String[] args) {
        int counter = 0; //lcv
        int x;

        while(counter <= 5) {
            //x = counter++;   // x = counter; counter++;
            x = ++counter;     // counter++; x = counter;
            System.out.println("counter: " + counter + " x: " + x);
        }

        // while loop - sentinel controlled
        int sentinel = 0;
        int var;
        Scanner in = new Scanner(System.in);
        var = in.nextInt();
        while(var != sentinel) {  // pretest loop
            System.out.println("You entered: " + var);
            var = in.nextInt();
        }

        // Post test loop
        int var2 = 0;
        do { // will run at least one time before conditions are met
            System.out.println(var2);
            var2++;
        } while(var2 <= 4);

        // for loop
        for(int i = 0; i < 5 ; i++) {
            System.out.println(i);
        }

        // nested for loops
        for(int i = 0; i <= 2; i++) {
            System.out.println();
            for(int k = 1; k <=4; k++) {
                System.out.print("*");
            }
        }

        // for each
        String[] names = {"Arup", "Keaton", "Ryan", "Shelby", "Bri"};
        for(String name: names) {
            System.out.println(name);
        }
    }
}