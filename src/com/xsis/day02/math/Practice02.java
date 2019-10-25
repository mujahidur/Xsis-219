package com.xsis.day02.math;

import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args) {
        double s, a, t;
        Scanner scan = new Scanner(System.in);
        System.out.print("Jarak: ");  // satuan meter
        s = scan.nextDouble();

        System.out.print("Percepatan: ");  // meter per second^2
        a = scan.nextDouble();

        t = Math.sqrt(2*s/a);  // t (time)

        System.out.println("Waktu yang ditempuh mobil: " + t);

        //  Math.round();  -->  membulatkan bilangan pecahan
        System.out.println("Waktu yang ditempuh mobil: " + Math.round(t));

        // Math.floor();  -->  membulatkan kebawah bilangan pecahan
        System.out.println("Waktu yang ditempuh mobil: " + Math.floor(t));
    }
}
