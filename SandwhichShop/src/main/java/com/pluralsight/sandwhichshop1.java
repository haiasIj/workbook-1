package com.pluralsight;

import java.util.Scanner;

public class sandwhichshop1 {

    public static void main(String[] args) {

        Scanner waiter = new Scanner(System.in);
        float regularSize = 5.45f;
        float largeSize = 8.95f;
        float regLoaded = 6.45f;
        float larLoaded = 10.70f;

        System.out.println("Welcome Big T's Sandwich Shoppe");

        System.out.print("Please choose a sandwich size (Enter 1 for Regular, 2 for Large, 3 for Loaded Regular, 4 for Loaded Large): ");

        int option = waiter.nextInt();

        System.out.print("Please enter your age for a discount: ");

        int age = waiter.nextInt();

        float base = 0f;

        if (option == 1) {
            base = regularSize;
        } else if (option == 2) {
            base = largeSize;
        } else if (option == 3) {
            base = regLoaded;
        } else if (option == 4) {
            base = larLoaded;
        } else {
            System.out.println("Please choose a correct option, 1 - 4; Please restart the app;");
        }



        double discount = 0.0;

        if (age <= 17) {
            discount = 0.10;
        } else if (age >= 65) {
            discount = 0.20;
        }



        System.out.printf("Your total is: $%.2f", base * (1-discount));




    }
}
