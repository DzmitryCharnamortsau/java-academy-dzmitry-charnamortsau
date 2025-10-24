package com.pluralsight;

import java.util.ArrayList;

public class Dealership {
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> vehicles = new ArrayList<>();

    public Dealership(String name, String address, String phone){
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.vehicles = new ArrayList<>();
    }
    public ArrayList<Vehicle> getVehiclesByPrice(double min, double max){
        return null;
    }
    public ArrayList<Vehicle> getVehicleByMakeModel(String make, String model){
        return null;
    }
    public ArrayList<Vehicle> getVehicleByYear(double min, double max){return null;}
    public ArrayList<Vehicle> getVehicleByColor(String color){return null;}
    public ArrayList<Vehicle> getVehicleByMileage(int min, int max){return null;}
    public ArrayList<Vehicle> getVehicleByType(String vehicleType){return null;}
    public ArrayList<Vehicle> getAllVehicles(){
        return new ArrayList<>(vehicles);
    }
    public void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
    }
    void removeVehicle(Vehicle vehicle){
        vehicles.remove(vehicle);
    }
}
