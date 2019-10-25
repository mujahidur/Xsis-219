package com.xsis.day02.Quiz;

import java.util.Scanner;

public class Quiz06 {
    public static void main(String[] args) {
        int a, b;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        a = scan.nextInt();
        System.out.print("Masukkan angka: ");
        b = scan.nextInt();

        System.out.println("------------------------------------------");

        if (a < b){
            System.out.println(a);
            System.out.println(b);
        } else{
            System.out.println(b);
            System.out.println(a);
        }
    }
}
