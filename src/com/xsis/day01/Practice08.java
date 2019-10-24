package com.xsis.day01;

// konversi temperatur dari farenheit ke kelvin
// rumus:   kelvin = (farenheit + 459.67)/1.8

import java.util.Scanner;

public class Practice08 {
    static final double cf = 459.67;
    static final double cd = 1.8;

    public static void main(String[] args) {
        double farenheit, kelvin;
        Scanner scan = new Scanner(System.in);
        System.out.print("Input Temperature in Farenheit: ");
        farenheit = scan.nextDouble();
        kelvin = (farenheit + cf)/cd;
        System.out.println("After Convertion to Kelvin: " + kelvin);
    }
}
