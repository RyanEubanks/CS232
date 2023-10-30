package Classwork.Labs.Lab9;
// Don't place your source in a package
import java.util.*;
import java.lang.*;
import java.io.*;

// Please name your class Main
class Main {
    
	public static void main (String[] args) throws java.lang.Exception {
        ArrayList<Integer> ints = new ArrayList<>();
        ints.

	    Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        int m = in.nextInt();
        String[] shortString = new String[m];
        int[] stringMaker = new int[n];

        int sum;
        String newString;

        for(int i = 0; i < m; i++) {
            shortString[i] = in.nextLine();
        }

        for(int j = 0; j < n; j++) {
            stringMaker[j] = 1;
        }
        
        while(stringMaker[stringMaker.length - 1] < 27) {
            newString = "";
            for(int let : stringMaker) {
                newString += (char)(96+let);
            }
            System.out.println(newString);
        }
	}
}