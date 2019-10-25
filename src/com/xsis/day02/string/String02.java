package com.xsis.day02.string;

import java.util.Scanner;

public class String02 {
    public static void main(String[] args) {
        String s, reverse;
        Scanner scan = new Scanner(System.in);
        System.out.print("Input: ");
        s = scan.next();
        System.out.println("Hasil: " + s);

        reverse = "" + s.charAt(3) + s.charAt(2) + s.charAt(1) + s.charAt(0);
        // triknya variabel reverse harus diberi "" agar terbaca sebagai String
        // jika tidak diberi "" maka akan terbaca sebagai integer

        System.out.println("Reverse: " + reverse);
    }
}
