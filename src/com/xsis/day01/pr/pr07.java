package com.xsis.day01.pr;

import java.util.Scanner;

public class pr07 {
    public static void main(String[] args) {
        int step, konversi, inch, mile, yard, feet, sisa;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan total langkah robot: ");
        step = scan.nextInt();

        System.out.println("");

        konversi = step * 25;

        mile = konversi / 63360;
        sisa = konversi % 63360;

        yard = sisa / 36;
        sisa = sisa % 36;

        feet = sisa / 12;
        sisa = sisa % 12;

        inch = sisa;

        System.out.println("Jarak yang ditempuh robot: " + mile + " Miles, " + yard + " Yard, " + feet + " Feet, " + inch + " Inch");
    }
}
