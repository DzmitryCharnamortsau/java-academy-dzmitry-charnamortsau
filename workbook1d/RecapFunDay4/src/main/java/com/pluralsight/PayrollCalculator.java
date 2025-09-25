package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name =  read.nextLine();
        System.out.println("Enter your hours worked ");
        float hoursWorked = read.nextFloat();
        System.out.println("Enter your pay rate: ");
        float payRate = read.nextFloat();
        float grossPay = hoursWorked * payRate;
        System.out.println(name + ", your gross pay is " + grossPay);
    }
}
