package com.pluralsight;

public class Main {
    public static void main(String[] args) {
      /*  Room room1 = new Room(2, 300.99, false, true, false);
        System.out.println(room1.isAvailable());
        Reservation reservation = new Reservation("king",139, 3, true);
        Reservation reservation1 = new Reservation("king", 139, 3, false);
        Reservation reservation2 = new Reservation("double",124,2, false);
        Reservation reservation3 = new Reservation("double",124,2, true);
        System.out.println(reservation.getReservationTotal());
        System.out.println(reservation1.getReservationTotal());
        System.out.println(reservation2.getReservationTotal());
        System.out.println(reservation3.getReservationTotal());
         */
        Employee e1 = new Employee(2403, "Dzmitry", "sales", 19, 41);
        System.out.println(e1.getTotalPay());
        System.out.println(e1.getOvertimeHours());
    }
}