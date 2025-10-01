package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CellPhoneApplication {
    public static void main(String[] args) {
        CellPhone phone = new CellPhone();
        phone.setPhoneNumber(1234567890);
        phone.setCarrier("T-Mobile");
        phone.setModel("Sony");
        phone.setSerialNumber(9999999);
        phone.setOwner("John Doe");
        System.out.println(phone.getPhoneNumber());
        System.out.println(phone.getCarrier());
        System.out.println(phone.getModel());
        System.out.println(phone.getSerial());
        System.out.println(phone.getOwner());
    }
}
