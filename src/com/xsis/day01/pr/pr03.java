package com.xsis.day01.pr;

import java.util.Scanner;

public class pr03 {
    public static void main(String[] args) {
        int input, sisa, ganjil, genap;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        input = scan.nextInt();

        System.out.println("");
        System.out.println("Keterangan:");
        System.out.println("angka ganjil ditunjukkan dengan (1), sebaliknya (0)");
        System.out.println("");

        sisa = (int) input % 2;
        System.out.println("Input terkategori: " + sisa);
    }
}
