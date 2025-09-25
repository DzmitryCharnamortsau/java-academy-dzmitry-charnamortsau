package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        double bobSalary = 30.5;
        double garySalary = 35.0;
        double highestSalary = Math.max(bobSalary,garySalary);
        System.out.println("The highest salary is " + highestSalary);
        double carPrice = 19999.99;
        double truckPrice = 49999.99;
        double smallestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The smallest price is " + smallestPrice);
    }
}
