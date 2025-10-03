package com.pluralsight;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
       Car myCar = new Car();
        System.out.println("Choose your car color: ");
        myCar.color = read.nextLine();
        System.out.println("Choose a model of your car: ");
        myCar.model = read.nextLine();
        System.out.println("Year of production: ");
        myCar.year = read.nextInt();
        System.out.println("What is the max speed? ");
        myCar.maxSpeed = read.nextInt();
        System.out.println("What is the current speed?");
        myCar.currentSpeed = read.nextInt();
        myCar.drive();
    }
}