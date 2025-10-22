package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;
    private boolean isAvailable;

    public Room (int numberOfBeds, double price, boolean isOccupied, boolean isDirty, boolean isAvailable){
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
        this.isAvailable = isAvailable;
    }
    public int getNumberOfBeds(){
        return this.numberOfBeds;
    }
    public double getPrice() {
        return price;
    }
    public boolean isOccupied() {
        return isOccupied;
    }
    public boolean isDirty() {
        return isDirty;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public void checkIn(){
        if(isOccupied && isDirty){
            System.out.println("Room is checked in");
        }

    }
    public void checkOut(){
        if(isDirty) {
            System.out.println("Room must be cleaned before checking in");
        }
    }
    public void cleanRoom(){
        if (isOccupied == false && isDirty == false && isAvailable){
            System.out.println("This room is available for check in");
        }

    }
}
