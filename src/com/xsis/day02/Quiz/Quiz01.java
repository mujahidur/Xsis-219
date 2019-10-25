package com.xsis.day02.Quiz;

import java.util.Scanner;

public class Quiz01 {
    public static void main(String[] args) {
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        number = scan.nextInt();

        if (number >= 0){
            System.out.println("Positive");
        } else{
            System.out.println("Negative");
        }
    }
}
