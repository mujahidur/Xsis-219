package com.xsis.day01;

import java.util.Scanner;

public class Practice03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int panjang=0, lebar=0, luas;

        System.out.print("Panjang: ");
        panjang = scan.nextInt();
        System.out.print("Lebar: ");
        lebar = scan.nextInt();
        luas = panjang * lebar;

        System.out.println("Luas persegi panjang: " + luas);
    }
}
