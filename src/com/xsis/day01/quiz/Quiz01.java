package com.xsis.day01.quiz;

import java.util.Scanner;

public class Quiz01 {
    static final double sudutSegitiga = 180;

    public static void main(String[] args) {
        double sudut1, sudut2, sudut3;
        Scanner scan = new Scanner(System.in);
        System.out.print("Input Sudut Segitiga 1: ");
        sudut1 = scan.nextDouble();
        System.out.print("Input Sudut Segitiga 2: ");
        sudut2 = scan.nextDouble();
        sudut3 = sudutSegitiga - (sudut1 + sudut2);
        System.out.println("Sudut ketiga segitiga adalah: " + sudut3);
    }
}
