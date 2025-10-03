package com.pluralsight;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Vehicle[] cars = new Vehicle[6];
        cars[0] = new Vehicle(101121, "Ford Explorer", "Red", 45000, 13500);
        cars[1] = new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000);
        cars[2] = new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700);
        cars[3] = new Vehicle(101124, "Honda Civic", "White", 70000, 7500);
        cars[4] = new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500);
        cars[5] = new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000);
        Scanner read = new Scanner(System.in);
        System.out.println("What do you want to do?");
        System.out.println(" 1 - List all vehicles");
        System.out.println(" 2 - Search by make/model");
        System.out.println(" 3 - Search by price range");
        System.out.println(" 4 - Search by color");
        System.out.println(" 5 - Add a vehicle");
        System.out.println(" 6 - Quit");
        System.out.println("Enter your command: ");
        int command = read.nextInt();
        if (command == 1){
            for (int i = 0; i< cars.length; i++){
                String first = cars[i].getMakeModel();
                System.out.println(first);
            }
        } else if (command == 3) {
            for (int i = 0; i< cars.length; i++){
                Float third = cars[i].getPrice();
                System.out.println(third);
            }
        } else if (command == 4){
            for(int i = 0; i<cars.length; i++){
                String fourth = cars[i].getColor();
                System.out.println(fourth);
            }
        } else {
            System.out.println("Wrong command");
        }
    }
}