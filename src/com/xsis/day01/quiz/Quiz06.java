package com.xsis.day01.quiz;

import java.util.Scanner;

public class Quiz06 {
    static final double pakem = 703;
    public static void main(String[] args) {
        double weight, height, bmi;
        Scanner scan = new Scanner(System.in);
        System.out.print("Input Height: ");
        height = scan.nextDouble();
        System.out.print("Input Weight: ");
        weight = scan.nextDouble();
        bmi = weight*pakem / height*height;
        System.out.println("Berat badan ideal anda adalah: " + bmi);
    }

}
