package com.xsis.day01;

import java.util.Scanner;

public class Practice05 {
    public static void main(String[] args) {
        double literPerKilo, totalJarakTempuh, totalLiter;
        Scanner scan = new Scanner(System.in);

        System.out.print("Total Jarak Tempuh: ");
        totalJarakTempuh = scan.nextDouble();
        System.out.print("Total Liter: ");
        totalLiter = scan.nextDouble();

        literPerKilo = totalJarakTempuh / totalLiter;

        System.out.println("Total Liter per Kilo: " + literPerKilo);
    }
}
