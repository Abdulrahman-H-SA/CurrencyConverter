package com.mycompany.currencyconverter;

import static com.mycompany.currencyconverter.Dollar_to_other.Dollar_to_other;
import static com.mycompany.currencyconverter.Euro_to_other.Euro_to_other;
import static com.mycompany.currencyconverter.Riyal_to_other.Riyal_to_other;
import static com.mycompany.currencyconverter.poundSterling_to_other.poundSterling_to_other;
import static com.mycompany.currencyconverter.yen_to_other.yen_to_other;
import static com.mycompany.currencyconverter.yuan_to_other.yuan_to_other;
 
import java.util.*;
import java.util.Scanner;

public class CurrencyConverter{

public static void main(String[] args) {

        System.out.println("Welcome to my project");
        System.out.println("1 Riyal");
        System.out.println("2 Dollar");
        System.out.println("3 Euro");
        System.out.println("4 yen");
        System.out.println("5 yuan");
        System.err.println("6 pound sterling");

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Choose the currency number");
            int choice = scanner.nextInt();
            System.out.println("Enter the amount");
            double amount = scanner.nextInt();

            System.out.println("");

            switch (choice) {
                case 1:
                    Riyal_to_other(amount);
                    break;
                case 2:
                    Dollar_to_other(amount);
                    break;
                case 3:
                    Euro_to_other(amount);
                    break;
                case 4:
                    yen_to_other(amount);
                    break;
                case 5:
                    yuan_to_other(amount);
                    break;
                case 6:
                    poundSterling_to_other(amount);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
     }
}