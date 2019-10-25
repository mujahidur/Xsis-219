package com.xsis.day01.pr;

import java.util.Scanner;

public class pr04 {
    public static void main(String[] args) {
        int angka, sisa;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        angka = scan.nextInt();

        sisa = ((int)angka+1) % 2;
        System.out.println("Angka terkategori: " + sisa);
    }
}
