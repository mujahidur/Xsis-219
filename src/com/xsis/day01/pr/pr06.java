package com.xsis.day01.pr;

import java.util.Scanner;

public class pr06 {
    public static void main(String[] args) {
        int cash1, cash2, cash3, cash4, sisa, nominal;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan nominal yang akan diambil: ");
        nominal = scan.nextInt();

        cash1 = (int)nominal / 20;
        sisa = (int)nominal % 20;

        cash2 = (int)sisa / 10;
        sisa = (int)sisa % 10;

        cash3 = (int)sisa / 5;
        sisa = (int)sisa % 5;

        cash4 = (int)sisa;

        System.out.println("Nominal yang anda peroleh: " + cash1 + " Lembar 20$, " + cash2 + " Lembar 10$, "
                + cash3 + " Lembar 5$, dan " + cash4 + " Lembar 1$");
    }
}
