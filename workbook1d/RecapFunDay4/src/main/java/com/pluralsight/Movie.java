package com.pluralsight;

public class Movie {
    public static void main(String[] args) {
        String movieTitle = "Skyfall";
        int numberOfFriends = 4;
        double pizzaSlicePrice = 5.49;
        double pizzaTotal = pizzaSlicePrice * (numberOfFriends + 1);
        boolean havePopcorn = true;
        System.out.println("We're watching " + movieTitle + " with " + numberOfFriends + " friends");
        System.out.println("The pizza total price is " + pizzaTotal);
        if (pizzaTotal > 25){
            System.out.println("It's too much, let's buy something else");
        }
        if (havePopcorn) {
            System.out.println("Cool, we have popcorn!");
        } else {
            System.out.println("We're out of popcorn");
        }
    }
}
