package com.xsis.day01.quiz;

import java.util.Scanner;

public class Quiz07 {
    static final double banyakProduct = 3;

    public static void main(String[] args) {
        double product1, product2, product3, ratarata1, ratarata2, pajak, totalHarga, totalHargaTax;
        Scanner scan = new Scanner(System.in);
        System.out.print("Harga Product 1: ");
        product1 = scan.nextDouble();
        System.out.print("Harga Product 2: ");
        product2 = scan.nextDouble();
        System.out.print("Harga Product 3: ");
        product3 = scan.nextDouble();
        System.out.print("Pajak tiap-tiap product (%): ");
        pajak = scan.nextDouble();
        totalHarga = product1 + product2 + product3;
        System.out.println("Total harga semua product: " + totalHarga);
        totalHargaTax = (product1 + (product1*pajak/100)) + (product2 + (product2*pajak/100))
                + (product3 + (product3*pajak/100));
        System.out.println("Total harga semua product setelah terkena pajak: " + totalHargaTax);
        ratarata1 = totalHarga / banyakProduct;
        ratarata2 = totalHargaTax / banyakProduct;
        System.out.println("Rata-rata harga product sebelum terkena pajak: " + ratarata1);
        System.out.println("Rata-rata harga product setelah terkena pajak: " + ratarata2);
    }
}
