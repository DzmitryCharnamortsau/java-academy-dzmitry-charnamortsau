package com.pluralsight;

import java.util.Scanner; //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String first = scnr.nextLine();
        System.out.println("Enter your last name: ");
        String last = scnr.nextLine();
        String getName = fullName(last, first);
        System.out.println(getName);
        System.out.println("Enter your age: ");
        int age = scnr.nextInt();
        ageVerify(age);
        if (age>=18){
            System.out.println("You're eligible to sign up");
        } else {
            System.out.println("You must be 18 or older");
        }

    }
    static void happyBirthday(String name, int age){
        System.out.println("Happy birthday to you, " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Happy birthday to you again!\n");
    }
    static boolean ageVerify(int age){
        if (age >= 18){
            return true;
        } else {
            return false;
        }
    }
    static int square(int number){
        return number*number/2;
    }
    static String fullName(String lastName, String firstName){
        return lastName + ", " + firstName;
    }
}