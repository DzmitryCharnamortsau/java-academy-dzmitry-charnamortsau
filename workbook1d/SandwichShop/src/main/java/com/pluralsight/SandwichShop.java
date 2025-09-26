package com.pluralsight;
import java.util.Scanner;
public class SandwichShop {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Would you like regular sandwich or large?");
        String sandwichSize = myScanner.nextLine();
        double regularPrice = 5.45;
        double largePrice = 8.95;
        double totalPrice = 0;
        if (sandwichSize.equals("regular")){
            totalPrice = regularPrice;
            System.out.println("The price is " + regularPrice);
        } else if (sandwichSize.equals("large")) {
            totalPrice = largePrice;
            System.out.println("The price is " + largePrice);
        } else {
            System.out.println("Invalid size, try again");
            return;
        }
        System.out.println("Would you like your sandwich loaded? Enter 'yes' or 'no'");
        String loaded = myScanner.nextLine();
        if (loaded.equals("yes")){
            if (sandwichSize.equals("regular")){
                totalPrice += 1.00;
                System.out.println("It's going to be a 1$ extra");
            } else if (sandwichSize.equals("large")){
                totalPrice +=1.75;
                System.out.println("It's going to be 1.75$ extra");
            }
        } else if (loaded.equals("no")) {
            System.out.println("There's no additional cost");
        } else {
            System.out.println("Invalid input, please enter 'yes' or 'no'");
            return;
        }
        System.out.println("Please, enter your age in order to check if you're eligible for a discount");
        int age = myScanner.nextInt();
        if (age <=17){
            totalPrice *= 0.9;
            System.out.println("You're eligible for a 10% discount");
        } else if (age >=65){
            totalPrice *= 0.8;
            System.out.println("You're eligible for a 20% discount");
        } else {
            System.out.println("You're not eligible for a discount");
        }
        System.out.printf("Your final total is %.2f", totalPrice);
    }
}