package com.pluralsight;
import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please provide the following information:");
        System.out.println("Full name: ");
        String name = myScanner.nextLine();
        System.out.println("Billing Street: ");
        String street = myScanner.nextLine();
        System.out.println("Billing City: ");
        String city = myScanner.nextLine();
        System.out.println("Billing State: ");
        String state = myScanner.nextLine();
        System.out.println("Billing zip: ");
        int zip = myScanner.nextInt();
        myScanner.nextLine();
        System.out.println("Shipping street: ");
        String shipStreet = myScanner.nextLine();
        System.out.println("Shipping City: ");
        String shipCity = myScanner.nextLine();
        System.out.println("Shipping State: ");
        String shipState = myScanner.nextLine();
        System.out.println("Shipping zip: ");
        int shipZip = myScanner.nextInt();
        myScanner.nextLine();
        System.out.println("\n" + name);
        StringBuilder billingAddress = new StringBuilder();
        billingAddress.append(street + ", ");
        billingAddress.append(city + ", ");
        billingAddress.append(state + " ");
        billingAddress.append(zip);
        String bilAddress = billingAddress.toString();
        System.out.println("Billing address: " + billingAddress);
        StringBuilder shippingAddress = new StringBuilder();
        shippingAddress.append(shipStreet + ", ");
        shippingAddress.append(shipCity + ", ");
        shippingAddress.append(shipState + " ");
        shippingAddress.append(shipZip);
        String shipAddr = shippingAddress.toString();
        System.out.println("Shipping address: " + shippingAddress);
        myScanner.close();
    }
}