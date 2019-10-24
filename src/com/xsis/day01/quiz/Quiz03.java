package com.xsis.day01.quiz;

import java.util.Scanner;

public class Quiz03 {
    static final double pajak = 7;
    static final double tips = 10;

    public static void main(String[] args) {
        double hargaMakanan, nominalPajak, nominalTips, totalHarga;
        Scanner scan = new Scanner(System.in);
        System.out.print("Harga Makanan: ");
        hargaMakanan = scan.nextDouble();
        nominalPajak = hargaMakanan * pajak/100;
        System.out.println("Pajak: " + nominalPajak);
        nominalTips = hargaMakanan * tips/100;
        System.out.println("Tips: " + nominalTips);
        totalHarga = hargaMakanan + nominalPajak + nominalTips;
        System.out.println("Total tagihan: " + totalHarga);
    }
}
