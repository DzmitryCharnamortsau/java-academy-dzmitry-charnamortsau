package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        double bobSalary = 30.5;
        double garySalary = 35.0;
        double highestSalary = Math.max(bobSalary,garySalary);
        System.out.println("The highest salary is " + highestSalary);
    }
}
