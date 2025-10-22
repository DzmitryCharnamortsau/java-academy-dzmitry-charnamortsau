package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Room room1 = new Room(2, 300.99, false, false, true);
        System.out.println(room1.isAvailable());
        room1.checkOut();
        room1.cleanRoom();
        /*Reservation reservation = new Reservation("king",139, 3, true);
        Reservation reservation1 = new Reservation("king", 139, 3, false);
        Reservation reservation2 = new Reservation("double",124,2, false);
        Reservation reservation3 = new Reservation("double",124,2, true);
        System.out.println(reservation.getReservationTotal());
        System.out.println(reservation1.getReservationTotal());
        System.out.println(reservation2.getReservationTotal());
        System.out.println(reservation3.getReservationTotal());
         */

        Employee e1 = new Employee(2403, "Dzmitry", "sales", 19, 19.5);
        Employee e2 = new Employee(7118, "Emma", "sales", 19, 23.5);
        System.out.println(e2.getTotalPay());
        e1.punchIn();
        e1.punchOut();
        System.out.println(e2.getRegularHours());



    }
}