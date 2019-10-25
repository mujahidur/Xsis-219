package com.xsis.day01.pr;

import java.util.Scanner;

public class pr01 {
    static final int multi = 8;
    public static void main(String[] args) {
        int input, sisa, total;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan nilai acak: ");
        input = scan.nextInt();

        sisa = input % 10;
        total = sisa * multi;
        System.out.println("Hasil kali digit terakhir dengan 8: " + total);
    }
}
