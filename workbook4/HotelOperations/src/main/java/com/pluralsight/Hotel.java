package com.pluralsight;

public class Hotel {
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    public Hotel(String name, int numberOfSuites, int numberOfRooms){
        this.name = name;
        this.numberOfSuites =0;
        this.numberOfRooms = 0;
    }
    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms){
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }
    public boolean bookRoom(int numberOfRooms, boolean isSuite) {
        if (numberOfRooms <= 0) {
            return false;
        }
        if (isSuite) {
            int availableSuits = numberOfSuites - bookedSuites;
            if (numberOfRooms <= availableSuits) {
                bookedSuites += numberOfRooms;
                return true;
            } else {
                int availableBasicRooms = numberOfRooms - bookedBasicRooms;
                if (numberOfRooms <= availableBasicRooms) {
                    bookedBasicRooms += numberOfRooms;
                    return true;
                }
            }

        }
        return false;
    }
    public String getAvailableSuites(){
        int availableSuites = numberOfSuites - bookedSuites;
        return "There are " + availableSuites + " available suites";
    }
    public String getAvailableRooms(){
        int availableRooms = numberOfRooms - bookedBasicRooms;
        return "There are " + availableRooms + " available rooms";
    }
}
