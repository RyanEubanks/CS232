/*
 * Problem Statement: Write a java program that takes user input for a laon's principal amount,
 * annual intersr rate, and loan term. Using the provided inputs and the 
 * standard formulas, calculate and display the monthly mortgage payment.
 * Ensure user-friendly output
 * 
 * Formulas: 
 * Monthly Interest Rate: (Annual interset rate / 12) / 100
 * Number of monthly payments = loan term * 12
 * Monthly mortgage payment = (principle amount * monthly interest rate) / (1 - (1 + Monthly interest rate)^(-Number of monthly payments))
 */
package Classwork.Labs.Lab2;

import java.util.Scanner;

public class mortgageCalculator {
    
    public static void main(String[] args) {

        // declare variables
        Scanner in = new Scanner(System.in);
        float principalAmount;
        float annualInterest;
        int loanTerm;
        float monthlyInterestRate;
        int num_monthlyPayments;
        float monthlyPayment;

        // prompt user
        System.out.println("Welcome to Mortgage Payment Calculator\n");
        System.out.println("Enter the following information:");

        System.out.print("Principle amount (in USD):");
        principalAmount = in.nextFloat();

        System.out.print("Annual Interest amount: ");
        annualInterest = in.nextFloat();

        System.out.print("Loan Term: ");
        loanTerm = in.nextInt();

        //Calculations
        monthlyInterestRate = (annualInterest / 12) / 100;
        num_monthlyPayments = loanTerm * 12;
        monthlyPayment = (principalAmount * monthlyInterestRate) / (float)(1 - Math.pow(1 + monthlyInterestRate, -num_monthlyPayments));

        // print results
        System.out.printf("\nYour Monthly Mortgage Payment is: $%.2f", monthlyPayment); 

        in.close();
    }
}
