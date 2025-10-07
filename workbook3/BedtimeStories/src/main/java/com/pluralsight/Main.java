package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What story do you want to read?");
        System.out.println("Type 1 for Goldilocks");
        System.out.println("Type 2 for Hansel and Gretel");
        System.out.println("Type 3 for Mary had a little lamb");
        int choice = input.nextInt();
        String fileName = "";
        switch (choice){
            case 1:
                fileName = "goldilocks.txt";
                break;
            case 2:
                fileName = "hansel_and_gretel.txt";
                break;
            case 3:
                fileName = "mary_had_a_little_lamb.txt";
                break;
            default:
                System.out.println("Invalid number entered");
                input.close();
                return;
        }
        try {
            BufferedReader bufReader = new BufferedReader(new FileReader(fileName));
            String line;
            int lineNumber = 1;
            while ((line = bufReader.readLine()) != null) {
                System.out.println(lineNumber + ". " + line);
                lineNumber++;
            }
            bufReader.close();
        }
        catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Wrong input, please try again");
        }
    }
}