package com.xsis.day01.quiz;

import java.util.Scanner;

public class Quiz05 {
    static final double cc = 32;
    static final double cd = .556;

    public static void main(String[] args) {
        double farenheit, celcius;
        Scanner scan = new Scanner(System.in);
        System.out.print("Input Temperature in Farenheit: ");
        farenheit = scan.nextDouble();
        celcius = (farenheit - cc)/cd;
        System.out.println("After Convertion to Celcius: " + celcius);
    }
}
