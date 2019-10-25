package com.xsis.day02.Quiz;

import java.util.Scanner;

public class Quiz02 {
    public static void main(String[] args) {
        int a, b;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan bilangan pertama: ");
        a = scan.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        b = scan.nextInt();

        if (a >= 0 && b >= 0){
            System.out.println("Positive!");
        } else{
            System.out.println("Negative!");
        }
    }
}
