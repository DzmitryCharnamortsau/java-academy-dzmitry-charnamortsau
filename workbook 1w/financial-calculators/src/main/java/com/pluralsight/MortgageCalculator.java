package com.pluralsight;
import java.util.Scanner;
public class MortgageCalculator {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your principal amount");
        double principal = scan.nextDouble();
        System.out.println("Enter your interest rate in %");
        double interestRate = scan.nextDouble();
        System.out.println("Enter your loan term in years");
        int years = scan.nextInt();
        double monthlyInterest = interestRate/100/12;
        double numberOfPayments = 12 * years;
        double monthlyPayment = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)) /
                (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
        double totalInterest = (monthlyPayment * numberOfPayments) - principal;
        System.out.printf("Expected monthly payment is %.2f%n", monthlyPayment);
        System.out.printf("Total interest is %.2f%n", totalInterest);
    }
}
