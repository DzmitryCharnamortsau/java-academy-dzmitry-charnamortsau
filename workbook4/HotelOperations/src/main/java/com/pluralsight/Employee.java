package com.pluralsight;

import java.util.Scanner;

public class Employee {
    private int employeeID;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double startTime;
    private double finishTime;
    private Scanner scanner = new Scanner(System.in);

    public Employee(int employeeID, String name, String department, double payRate, double hoursWorked){
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public String getTotalPay(){
        double totalPay = hoursWorked*payRate;
        return name + "'s total pay is "  + totalPay;
    }
    public double getRegularHours(){
        double regularHours = hoursWorked;
        if (hoursWorked < 40){
            regularHours = hoursWorked;
        }
        return regularHours;
    }
    public double getOvertimeHours(){
        double overtimeHours = 0;
        if (hoursWorked > 40){
            overtimeHours = hoursWorked - 40;
        }
        return overtimeHours;
    }
    public void punchIn(){
        System.out.println("Enter your start time: ");
        startTime = scanner.nextDouble();
    }
    public void punchOut(){
        System.out.println("Enter your finish time");
        finishTime = scanner.nextDouble();
        double hours = finishTime - startTime;
        System.out.println("You worked " + hours);
    }
}
