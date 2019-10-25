package com.xsis.day02.condition;

import java.util.Scanner;

public class Condition02 {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        n = scan.nextInt();

        if (n % 2 == 0){
            System.out.println("Genap");
        } else{
            System.out.println("Ganjil");
        }
    }
}
