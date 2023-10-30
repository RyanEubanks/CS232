package Classwork.Labs.Lab9;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        
        int shift;
        int numMessages;

        numMessages = in.nextInt();
        
        while(numMessages > 0) {
            shift = in.nextInt();
            String line = sc.nextLine();
            Boolean plain = false;
            for(int j = 0; j < line.length() - 2; j++) {
                String theTest = line.charAt(j) + "" + line.charAt(j + 1) + "" + line.charAt(j + 2);
                    if(theTest.equals("the")) {
                        plain = true;
                        break;
                    }
            }

            if(plain) {
                for(int i = 0; i < line.length(); i++) {
                    if(line.charAt(i) == ' ') {
                        i++;
                        System.out.print(" ");
                    }
                    else { // String theTest = line.charAt(i) + line.charAt(i + 1) + line.charAt(i + 2)
                        char letter = line.charAt(i);
                        int ASCIIletter = letter - shift;
                        if(ASCIIletter < 97) {
                            ASCIIletter += 26;
                        }
                        char let = (char)ASCIIletter;
                        System.out.print(let);
                    }
                }
            } else {
                for(int i = 0; i < line.length(); i++) {
                    if(line.charAt(i) == ' ') {
                        i++;
                        System.out.print(" ");
                    }
                    else { // String theTest = line.charAt(i) + line.charAt(i + 1) + line.charAt(i + 2)
                        char letter = line.charAt(i);
                        int ASCIIletter = letter + shift;
                        if(ASCIIletter > 122) {
                            ASCIIletter -= 26;
                        }
                        char let = (char)ASCIIletter;
                        System.out.print(let);
                    }
                }
            }
            System.out.println();
            numMessages--;

        }
        
    }
}
