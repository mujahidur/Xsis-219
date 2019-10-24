package com.xsis.day01.quiz;

import java.util.Scanner;

public class Quiz08 {
    public static void main(String[] args) {
        double harga, discount, hemat;
        Scanner scan = new Scanner(System.in);
        System.out.print("Harga Barang: ");
        harga = scan.nextDouble();
        System.out.print("Discount (%): ");
        discount = scan.nextDouble();
        hemat = harga * discount/100;
        System.out.println("pembeli berhemat: " + hemat);
    }
}
