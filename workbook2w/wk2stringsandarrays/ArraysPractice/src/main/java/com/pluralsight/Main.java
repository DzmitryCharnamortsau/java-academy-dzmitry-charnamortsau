package com.pluralsight;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int [] scores = {25, 46, 78, 79, 11, 20, 92, 81, 97, 68};
        int sum = 0;
        for (int i = 0; i<scores.length; i++) {
            sum += scores[i];
        }
        double average = (double)sum / scores.length;
        int highScore = 0;
        for (int h = 0; h<scores.length; h++){
            if (scores[h]> highScore){
                highScore = scores[h];
            }
        }
        int lowScore = scores[0];
        for (int j = 0; j<scores.length; j++){
            if (scores [j] < lowScore){
                lowScore = scores [j];
            }
        }
        System.out.println("Average is " + average);
        System.out.println("High score is " + highScore);
        System.out.println("Low score is " + lowScore);
    }
}