package com.xsis.day01;

import java.util.Scanner;

public class Practice06 {
    static final double pajak = .15;

    public static void main(String[] args) {
        double itemBeforeTax, taxPerItem, itemAfterTax;
        Scanner scan = new Scanner(System.in);
        System.out.print("Harga Barang Sebelum Pajak: ");
        itemBeforeTax = scan.nextDouble();
        taxPerItem = itemBeforeTax * pajak;
        System.out.println("Pajak Barang: " + taxPerItem);
        System.out.println("----------------------------");
        itemAfterTax = itemBeforeTax + taxPerItem;
        System.out.print("Total Harga: " + itemAfterTax);
    }
}
