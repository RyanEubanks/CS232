package Classwork.Labs.Lab1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
 
public class SecretPasswords
{
    public static void main (String [] args) throws IOException {
        Scanner in;
        in = new Scanner(System.in);
 

        FileWriter outFile = new FileWriter("Passwords.txt");
 
        Random random = new Random();
        System.out.println("============Menu=========");
        System.out.println("[1] Lowercase letters");
        System.out.println("[2] Uppercase letters");
        System.out.println("[3] Numbers");
        System.out.println("[4] Numbers and lowercase letters");
        System.out.println("[5] Numbers and Uppercase letters");
        System.out.println("[6] Number and a mix of Upper and lowercase letters");
        System.out.print("=========================");
        System.out.println();
 
        System.out.println();
        System.out.println("Menu Option 1-6");
        int menuOpt = in.nextInt();
 
        System.out.println("How long do you want the password (must be > or = 6");
        int passLength = in.nextInt();
        while(passLength < 6) {
            System.out.println("Please type a number > than 6");
            passLength = in.nextInt();
        }
 
        System.out.println("How many passwords would you like");
        int numPasswords = in.nextInt();
 
        if(menuOpt == 1) {
            for (int i = 0; i < numPasswords; i++) {
                for (int j = 0; j <= passLength; j++) {
                    int ASCIIletters = random.nextInt(26);
                    char lowerCaseletters = (char) (ASCIIletters + 97);
                    outFile.write(lowerCaseletters);
                    if (j == passLength) {
                        outFile.write("\n");
                    }
                }
            }
        }
 
        else if(menuOpt == 2) {
            for (int i = 0; i < numPasswords; i++) {
                for (int j = 0; j <= passLength; j++) {
                    int ASCIIBigletters = random.nextInt(26);
                    char UpperCaseletters = (char) (ASCIIBigletters + 65);
                    outFile.write(UpperCaseletters);
                    if( j == passLength) {
                        outFile.write("\n");
                    }
                }
            }
        }
        else if(menuOpt == 3) {
            for (int i = 0; i < numPasswords; i++) {
                for (int j = 0; j <= passLength; j++) {
                    int ASCIInumbers = random.nextInt(10);
                    char numbers = (char) (ASCIInumbers + 48);
                    outFile.write(numbers);
                    if( j == passLength) {
                        outFile.write("\n");
                    }
                }
            }
        }
        else if(menuOpt == 4) {
            for (int i = 0; i < numPasswords; i++) {
                for (int j = 0; j <= passLength; j++) {
                    int ASCIInumbers = random.nextInt(10);
                    char numbers = (char) (ASCIInumbers + 48);
                    int ASCIIlowerletters = random.nextInt(26);
                    char lowerLetters = (char) (ASCIIlowerletters + 97);
                    outFile.write(numbers + "" + lowerLetters);
                    if( j == passLength) {
                        outFile.write("\n");
                    }
                }
            }
        }
        else if(menuOpt == 5) {
            for (int i = 0; i < numPasswords; i++) {
                for (int j = 0; j <= passLength; j++) {
                    int ASCIInumbers = random.nextInt(10);
                    char numbers = (char) (ASCIInumbers + 48);
                    int ASCIIBigletters = random.nextInt(26);
                    char UpperCaseletters = (char) (ASCIIBigletters + 65);
                    outFile.write(numbers + "" + UpperCaseletters);
                    if( j == passLength) {
                        outFile.write("\n");
                    }
                }
            }
        }
        else if(menuOpt == 6) {
            for (int i = 0; i < numPasswords; i++) {
                for (int j = 0; j <= passLength; j++) {
                    int ASCIInumbers = random.nextInt(10);
                    char numbers = (char) (ASCIInumbers + 48);
                    int ASCIIBigletters = random.nextInt(26);
                    char UpperCaseletters = (char) (ASCIIBigletters + 65);
                    int ASCIIlowerletters = random.nextInt(26);
                    char lowerLetters = (char) (ASCIIlowerletters + 97);
                    outFile.write(numbers + "" + UpperCaseletters + "" + lowerLetters);
                    if( j == passLength) {
                        outFile.write("\n");
                    }
                }
            }
        }
 
        outFile.close();
        FileReader reading = new FileReader("Passwords.txt");
        System.out.println("Here are your passwords :)");
        int i;
        while((i = reading.read()) != -1) {
            System.out.print((char)i);
        }
        System.out.println();
        System.out.println("Thanks for using password Generator!!!");
    }//ends main
}//ends class
//i spent wayyyy to long on this
