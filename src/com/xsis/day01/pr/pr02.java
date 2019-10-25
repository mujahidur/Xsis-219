package com.xsis.day01.pr;

import java.util.Scanner;

public class pr02 {
    public static void main(String[] args) {
        int number, sisa, digit1, digit2, digit3, digit4, digit5, reverse;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan angka 5 digit: ");
        number = scan.nextInt();

        digit1 = (int)number / 10000;
        sisa = (int)number % 10000;
        System.out.println("digit 1: " + digit1 + ", sisa: " + sisa);

        digit2 = (int)sisa / 1000;
        sisa = (int)sisa % 1000;
        System.out.println("digit 2: " + digit2 + ", sisa: " + sisa);

        digit3 = (int)sisa / 100;
        sisa = (int)sisa % 100;
        System.out.println("digit 3: " + digit3 + ", sisa: " + sisa);

        digit4 = (int)sisa / 10;
        sisa = (int)sisa % 10;
        System.out.println("digit 4: " + digit4 + ", sisa: " + sisa);

        digit5 = (int)sisa;
        sisa = (int)sisa % 1;
        System.out.println("digit 5: " + digit5 + ", sisa: " + sisa);

        reverse = (digit5*10000) + (digit4*1000) + (digit3*100) + (digit2*10) + digit1;

        System.out.println("hasil Reverse adalah: " + reverse);
    }
}
