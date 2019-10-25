package com.xsis.day02.Quiz;

import java.util.Scanner;

public class Quiz05 {
    public static void main(String[] args) {
        int aa, bb, cc, dd;
        Scanner scan = new Scanner(System.in);
        System.out.print("Input angka: ");
        aa = scan.nextInt();
        System.out.print("Input angka: ");
        bb = scan.nextInt();
        System.out.print("Input angka: ");
        cc = scan.nextInt();
        System.out.print("Input angka: ");
        dd = scan.nextInt();

        if (aa >= 0 && bb >= 0 && cc >= 0 && dd >= 0){
            System.out.println("");
        } else{
            System.out.println("Among the given number, there is a negative one");
        }
    }

}
