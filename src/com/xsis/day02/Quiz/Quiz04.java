package com.xsis.day02.Quiz;

import java.util.Scanner;

public class Quiz04 {
    public static void main(String[] args) {
        String kata;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan kalimat: ");
        kata = scan.nextLine();

        if (kata.length() > 20){
            System.out.println("Many Characters!");
        } else{
            System.out.println("");
        }
    }
}
