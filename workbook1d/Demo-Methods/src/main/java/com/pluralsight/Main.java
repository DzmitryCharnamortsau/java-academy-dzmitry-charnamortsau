package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Retirement(50);
    }
    public static void Retirement(int years) {
        System.out.println("You have " + (67 - years) + " years left till retirement");
    }

}