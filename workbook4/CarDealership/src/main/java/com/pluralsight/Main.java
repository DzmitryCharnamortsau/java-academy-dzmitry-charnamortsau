package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Dealership dealership = new Dealership("HotWheels", "123 Main St", "123-456-7890");
        Vehicle vehicle1 = new Vehicle(123456, 2023, "Audi", "A4",
                "sedan", "black", 1500, 39999.99);
        dealership.addVehicle(vehicle1);
        System.out.println(vehicle1);
    }
}