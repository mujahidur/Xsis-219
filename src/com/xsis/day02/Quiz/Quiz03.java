package com.xsis.day02.Quiz;

import java.util.Scanner;

public class Quiz03 {
    public static void main(String[] args) {
        String kata;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan kalimat: ");
        kata = scan.nextLine();
        System.out.println("----------------------------------------");
        System.out.println(kata);

        if (kata.equals(kata.toUpperCase())){
            System.out.println("Uppercase");
        } else{
            System.out.println("");
        }
    }
}
