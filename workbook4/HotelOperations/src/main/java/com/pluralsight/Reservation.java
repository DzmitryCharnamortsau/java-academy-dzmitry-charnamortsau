package com.pluralsight;

public class Reservation {
    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean isWeekend;

    public Reservation(String roomType, double price, int numberOfNights, boolean isWeekend){
        this.roomType = roomType;
        this.price = price;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }
    public String getRoomType(){
        return this.roomType;
    }
    public void setRoomType(String roomType){
        this.roomType = roomType;
    }
    public double getPrice(){
        return this.price;
    }
    public int getNumberOfNights(){
        return this.numberOfNights;
    }
    public void setNumberOfNights(int numberOfNights){
        this.numberOfNights = numberOfNights;
    }
    public boolean isWeekend(){
        return this.isWeekend;
    }
    public void setIsWeekend(boolean isWeekend){
        this.isWeekend = isWeekend;
    }
    public double getReservationTotal(){
        double total = numberOfNights * price;
        if (isWeekend) {
            total *= 1.10;
        }
        return Double.parseDouble(String.format("%.2f", total));
    }

}
