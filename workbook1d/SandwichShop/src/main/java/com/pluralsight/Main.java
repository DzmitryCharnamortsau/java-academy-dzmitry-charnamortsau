package com.pluralsight;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter your password");
        String password = myScanner.nextLine();
        if (password.equals("1234")){
            System.out.println("Password is correct");
        } else {
            System.out.println("Incorrect password");
        }
    }
}
