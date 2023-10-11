package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder addressInfo = new StringBuilder();

        System.out.println("Please enter the following information below:");

        // Prompt the user for billing information
        System.out.print("Full Name: ");
        String fullName = scanner.nextLine();
        addressInfo.append("Full Name: ").append(fullName).append("\n");

        System.out.print("Billing Street: ");
        String billingStreet = scanner.nextLine();
        addressInfo.append("Billing Street: ").append(billingStreet).append("\n");

        System.out.print("Billing City: ");
        String billingCity = scanner.nextLine();
        addressInfo.append("Billing City: ").append(billingCity).append("\n");

        System.out.print("Billing State (Abbreviated): ");
        String billingState = scanner.nextLine();
        addressInfo.append("Billing State: ").append(billingState).append("\n");

        System.out.print("Billing Zip code: ");
        String billingZip = scanner.nextLine();
        addressInfo.append("Billing Zip code: ").append(billingZip).append("\n");

        // Prompt the user for shipping information
        System.out.print("Shipping Street: ");
        String shippingStreet = scanner.nextLine();
        addressInfo.append("\nShipping Street: ").append(shippingStreet).append("\n");

        System.out.print("Shipping City: ");
        String shippingCity = scanner.nextLine();
        addressInfo.append("Shipping City: ").append(shippingCity).append("\n");

        System.out.print("Shipping State: ");
        String shippingState = scanner.nextLine();
        addressInfo.append("Shipping State: ").append(shippingState).append("\n");

        System.out.print("Shipping Zip code: ");
        String shippingZip = scanner.nextLine();
        addressInfo.append("Shipping Zip code: ").append(shippingZip);

        // Display customer information
        System.out.println("\nCustomer Information:");
        System.out.println(addressInfo.toString());

        // Close the scanner
        scanner.close();
    }
}
