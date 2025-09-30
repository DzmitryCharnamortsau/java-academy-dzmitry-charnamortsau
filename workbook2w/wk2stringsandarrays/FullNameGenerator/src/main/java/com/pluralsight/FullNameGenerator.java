package com.pluralsight;
import java.util.Scanner;
public class FullNameGenerator {
    public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
        System.out.println("Enter your name");
        System.out.println("Enter your first name: ");
        String firstName = read.nextLine().trim();
        System.out.println("Enter your middle name: ");
        String middleName = read.nextLine().trim();
        System.out.println("Enter your last name: ");
        String lastName = read.nextLine().trim();
        System.out.println("Enter your suffix: ");
        String suffix = read.nextLine().trim();
        read.close();
        StringBuilder fullName = new StringBuilder();
        fullName.append(firstName).append(" ");
        if (!middleName.isEmpty()) {
            fullName.append(middleName).append(" ");
        }
        fullName.append(lastName);
        if (!suffix.isEmpty()) {
            fullName.append(", ").append(suffix);
        }
        System.out.println("Full Name: " + fullName.toString());
    }
}