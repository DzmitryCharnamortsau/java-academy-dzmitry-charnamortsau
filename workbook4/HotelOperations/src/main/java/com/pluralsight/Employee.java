package com.pluralsight;

public class Employee {
    private int employeeID;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    public Employee(int employeeID, String name, String department, double payRate, double hoursWorked){
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public double getTotalPay(){
        double totalPay = hoursWorked*payRate;
        return totalPay;
    }
    public double getRegularHours(){
        double regularHours = 0;
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
}
