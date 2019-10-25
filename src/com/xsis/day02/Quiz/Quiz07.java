package com.xsis.day02.Quiz;

import java.util.Scanner;

public class Quiz07 {
    public static void main(String[] args) {
        double a, b, c, ratarata;
        Scanner scan = new Scanner(System.in);
        System.out.println("Suhu dalam satuan Farenheit di wilayah Jawa Timur");
        System.out.print("Masukkan suhu Nganjuk saat ini\t: ");
        a = scan.nextDouble();
        System.out.print("Masukkan suhu Malang saat ini\t: ");
        b = scan.nextDouble();
        System.out.print("Masukkan suhu Surabaya saat ini\t: ");
        c = scan.nextDouble();
        ratarata = (a+b+c)/3;

        System.out.println("----------------------------------------------------------");

        if (ratarata > 45){
            System.out.println("Suhu Jawa Timur saat ini terlalu panas");
        } else{
            System.out.println("Suhu Jawa Timur saat ini dalam kondisi normal");
        }
    }
}
