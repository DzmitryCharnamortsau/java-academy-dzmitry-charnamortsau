package com.pluralsight;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Employee {
    private int employeeID;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double startTime;
    private LocalDateTime punchInTime;
    private LocalDateTime punchOutTime;
    private double endTime;
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
    public void punchIn(double time){
        startTime = time;
        System.out.println("You're started at " + startTime);
    }
    public void punchOut(double time) {
        endTime = time;
        System.out.println("You're finished at " + endTime);
        double totalHours = endTime - startTime;
        System.out.println("You worked " + totalHours + " hours today");
    }
    public void punchIn(){
        punchInTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd | HH:mm:ss");
        String formattedDateTime = punchInTime.format(formatter);
        System.out.println("You punched in at " + formattedDateTime);

    }
    public void punchOut(){
        punchOutTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd | HH:mm:ss");
        String formattedDateTime = punchOutTime.format(formatter);
        System.out.println("You punched out at " + formattedDateTime);
    }
}
