package com.pluralsight;

import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your deposit: ");
        double deposit = input.nextDouble();
        System.out.println("Enter your interest rate in %: ");
        double intRate = input.nextDouble();
        System.out.println("Enter the number of years: ");
        int years = input.nextInt();
        double rate = intRate/100;
        double futureValue = deposit * Math.pow(1+(rate/365), 365*years);
        double totalInt = futureValue - deposit;
        System.out.printf("Your future value is %.2f\n ",futureValue);
        System.out.printf("Your total interest is %.2f ", totalInt);
        input.close();
    }
}
