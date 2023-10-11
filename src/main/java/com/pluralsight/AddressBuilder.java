package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder addressInfo = new StringBuilder();
//  User inputs
        System.out.println("Please enter the following information below: ");
        System.out.print("Full Name: ");
        String fullName = scanner.nextLine();
        addressInfo.append(fullName).append("\nBilling Address:\n");

        System.out.print("Billing Street: ");
        String billingStreet = scanner.nextLine();
        addressInfo.append(billingStreet).append("\n");

        System.out.print("Billing City: ");
        String billingCity = scanner.nextLine();
        addressInfo.append(billingCity).append(", ");

        System.out.print("Billing State (Abbreviated): ");
        String billingState = scanner.nextLine();
        addressInfo.append(billingState).append(" ");

        System.out.print("Billing Zip code: ");
        String billingZip = scanner.nextLine();
        addressInfo.append(billingZip).append("\nShipping Address:\n");

        System.out.print("Shipping Street: ");
        String shippingStreet = scanner.nextLine();
        addressInfo.append(shippingStreet).append("\n");

        System.out.print("Shipping City: ");
        String shippingCity = scanner.nextLine();
        addressInfo.append(shippingCity).append(", ");

        System.out.print("Shipping State: ");
        String shippingState = scanner.nextLine();
        addressInfo.append(shippingState).append(" ");

        System.out.print("Shipping Zip code: ");
        String shippingZip = scanner.nextLine();
        addressInfo.append(shippingZip);
//  Display Information in a specific format
        System.out.println("\nCustomer Information:");
        System.out.println(addressInfo.toString());

//  Close the scanner
        scanner.close();
    }
}