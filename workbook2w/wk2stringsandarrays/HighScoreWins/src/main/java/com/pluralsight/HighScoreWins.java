package com.pluralsight;
import java.util.Scanner;

public class HighScoreWins {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a game score: ");
        String score = input.nextLine();
        String [] parts = score.split(("\\|"));
        String [] teams = parts[0].split((":"));
        String [] scores = parts[1].split((":"));
        int homeScore = Integer.parseInt(scores[0]);
        int visitorScore = Integer.parseInt(scores[1]);
        if (homeScore > visitorScore){
            System.out.println("Winner: " + teams[0]);
        } else if (homeScore < visitorScore) {
            System.out.println("Winner: " + teams[1]);
        } else {
            System.out.println("It's a tie");
        } input.close();
    }
}