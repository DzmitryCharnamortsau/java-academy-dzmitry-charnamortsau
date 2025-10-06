package com.pluralsight;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            String[] quotes = {"Grow through what you go through",
                    "Small steps every day lead to big change.",
                    "Peace begins where expectation ends.",
                    "You are not behind; you're on your path.",
                    "Let your actions speak your truth.",
                    "Silence is sometimes the best answer.",
                    "Fall in love with becoming.",
                    "Your pace is still progress.",
                    "Let go to grow.",
                    "Purpose over perfection."};
            System.out.print("Select a quote (select #1 - #10): ");
            int index = input.nextInt();
            index--;
            System.out.println(quotes[index]);
        }
        catch (Exception exception){
            System.out.println("Your number is out of range! Please try again");
            exception.printStackTrace();
        }
        input.close();
    }
}