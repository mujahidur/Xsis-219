package com.xsis.day01;

import java.util.Scanner;

public class Practice07 {
    public static void main(String[] args) {
        double itemBeforeDiscount, discount, itemAfterDiscount;
        Scanner scan = new Scanner(System.in);
        System.out.print("Harga Barang: ");
        itemBeforeDiscount = scan.nextDouble();
        System.out.print("Discount: ");
        discount = scan.nextDouble();
        itemAfterDiscount = itemBeforeDiscount - (itemBeforeDiscount * discount/100);
        System.out.println("Price After Discount: " + itemAfterDiscount);
    }
}
