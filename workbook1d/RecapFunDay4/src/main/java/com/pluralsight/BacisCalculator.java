package com.pluralsight;

import java.util.Scanner;

public class BacisCalculator {
    public static void main(String[] args){
      Scanner myScanner = new Scanner(System.in);
        System.out.printf("Enter the first number: ");
        int num1 = myScanner.nextInt();
        System.out.printf("Enter the second number: ");
        int num2 = myScanner.nextInt();
        myScanner.nextLine();
        System.out.println("Possible options are: (A)dd, (S)ubtract, (M)ultitply, (D)ivide ");
        System.out.println("Please press M ");
        String option = myScanner.nextLine();
        System.out.println("Now we perform multiplication");
        int sum = num1 * num2;
        System.out.println("The sum is: " + sum);

    }
}
