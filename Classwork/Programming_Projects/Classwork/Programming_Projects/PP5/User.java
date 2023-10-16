/*
 * @Author: Ryan Eubanks
 * @Date: 10/15/23
 * 
 * Problem Statement:
 * Create a program that can manage users by creating them, checking their password strength, removing them, and changing their password
 */
package Classwork.Programming_Projects.PP5;
import java.util.Scanner;
import java.util.Random;

public class User {
    private String userName;
    private StringBuilder password;
    private int passLength;
    private int option;
    private static int shift = 3;
    Scanner in = new Scanner(System.in);
    Random random = new Random();
    
    // constructor
    public User(String userName) {
        this.userName = userName;
        this.password = changePassword();

    }
    // alternate constructor
    public User(String userName, StringBuilder password) {
        this.userName = userName;
        this.password = password;
    }
    
    @Override
    public String toString() {
        return this.userName + " : " + this.password;
    }

    // function that gives different password changing options
    public StringBuilder changePassword() {
        boolean condition = false;
        do {
            System.out.println("===== Password Creation =====");
            System.out.println("[0] Manual password entry \n");
            System.out.println("Generate password ");
            System.out.println("[1] Lowercase letters");
            System.out.println("[2] Uppercase letters");
            System.out.println("[3] Numbers");
            System.out.println("[4] Numbers and lowercase letters");
            System.out.println("[5] Numbers and Uppercase letters");
            System.out.println("[6] Number and a mix of Upper and lowercase letters");
            option = in.nextInt();

            switch(option) {
                case 0:
                    manualChange();
                    condition = true;
                    break;
                case 1:
                    passwordLength();
                    lowerLettersOnly();
                    condition = true;
                    break;
                case 2:
                    passwordLength();
                    upperCaseLetters();
                    condition = true;
                    break;
                case 3:
                    passwordLength();
                    numbers();
                    condition = true;
                    break;
                case 4:
                    passwordLength();
                    nums_LowerLetters();
                    condition = true;
                    break;
                case 5:
                    passwordLength();
                    nums_UpperLetters();
                    condition = true;
                    break;
                case 6:
                    passwordLength();
                    nums_Upper_LowerLetters();
                    condition = true;
                    break;
                default: 
                    System.out.println("Invalid input");

            }
        } while(condition != true);

        return this.password;
    }

    // ===================== Getters ===========================
    public String getUserName() {
        return this.userName;
    }

    public StringBuilder getPassWord() {
        return this.password;
    }

    // =================== Aux Funcitons =======================

    public void checkPasswordStrength(StringBuilder userPassword) {
        String password = userPassword.toString();

        int score = 0;

        boolean hasUppercase = password.matches(".*[A-Z].*");
        boolean hasLowercase = password.matches(".*[a-z].*");
        boolean hasSpecialCharacter = password.matches(".*[^a-zA-Z].*");
        boolean hasMinimumLength = password.length() >= 8;

        if (hasUppercase) {
            score++;
        }
        if (hasLowercase) {
            score++;
        }
        if (hasSpecialCharacter) {
            score++;
        }
        if (hasMinimumLength) {
            score++;
        }

        if (score == 4) {
            System.out.println("Strong password");
        } 
        else if (score >= 2) {
            System.out.println("Moderate password");
        } 
        else {
            System.out.println("Your password sucks!");
        }
    }
    public int passwordLength() {
        System.out.println("Enter the amount characters your password will have: ");
        this.passLength = in.nextInt();
        return this.passLength;
    }

    public void manualChange() {
        System.out.println("Enter a password: ");
        this.password = new StringBuilder(in.next());
    }

    //** Auto Password Generationg Options
    public void lowerLettersOnly() {
        StringBuilder newPassword = new StringBuilder();
        for (int j = 0; j <= passLength; j++) {
            int ASCIIletters = random.nextInt(26);
            char lowerCaseletters = (char) (ASCIIletters + 97);
            newPassword.append(lowerCaseletters);
        }
        this.password = newPassword;
    }

    public void upperCaseLetters() {
        StringBuilder newPassword = new StringBuilder();
        for (int i = 0; i <= passLength; i++) {
            int ASCIIBigletters = random.nextInt(26);
            char UpperCaseletters = (char) (ASCIIBigletters + 65);
            newPassword.append(UpperCaseletters);
        }
        this.password = newPassword;
    }

    public void numbers() {
        StringBuilder newPassword = new StringBuilder();
        for (int i = 0; i <= passLength; i++) {
            int ASCIInumbers = random.nextInt(10);
            char numbers = (char) (ASCIInumbers + 48);
            newPassword.append(numbers);
        }
        this.password = newPassword;
    }

    public void nums_LowerLetters() {
        StringBuilder newPassword = new StringBuilder();
        for (int i = 0; i <= passLength; i++) {
            int ASCIInumbers = random.nextInt(10);
            char numbers = (char) (ASCIInumbers + 48);
            int ASCIIlowerletters = random.nextInt(26);
            char lowerLetters = (char) (ASCIIlowerletters + 97);
            newPassword.append(numbers + "" + lowerLetters);
        }
        this.password = newPassword;
    }
    
    public void nums_UpperLetters() {
        StringBuilder newPassword = new StringBuilder();
        for (int j = 0; j <= passLength; j++) {
            int ASCIInumbers = random.nextInt(10);
            char numbers = (char) (ASCIInumbers + 48);
            int ASCIIBigletters = random.nextInt(26);
            char UpperCaseletters = (char) (ASCIIBigletters + 65);
            newPassword.append(numbers + "" + UpperCaseletters);
        }
        this.password = newPassword;
    }

    public void nums_Upper_LowerLetters() {
        StringBuilder newPassword = new StringBuilder();
        for (int i = 0; i <= passLength; i++) {
            int ASCIInumbers = random.nextInt(10);
            char numbers = (char) (ASCIInumbers + 48);
            int ASCIIBigletters = random.nextInt(26);
            char UpperCaseletters = (char) (ASCIIBigletters + 65);
            int ASCIIlowerletters = random.nextInt(26);
            char lowerLetters = (char) (ASCIIlowerletters + 97);
            newPassword.append(numbers + "" + UpperCaseletters + "" + lowerLetters);
        } 
        this.password = newPassword;      
    }

    // maybe implement later
    public void encrypt(StringBuilder password, int shift) {
        for (int i = 0; i < password.length(); i++) {
            char originalChar = password.charAt(i);
            char encryptedChar = (char) (originalChar + shift);
            password.setCharAt(i, encryptedChar);
        }
    }
    public void decrypt(StringBuilder password, int shift) {
        for (int i = 0; i < password.length(); i++) {
            char encryptedChar = password.charAt(i);
            char decryptedChar = (char) (encryptedChar - shift);
            password.setCharAt(i, decryptedChar);
        }
    }

}