package com.xsis.day01;

import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("First Name\t: ");
        String ss = scan.nextLine();
        System.out.print("Last Name\t: ");
        String lastName = scan.nextLine();
        System.out.println("Full Name\t: " + ss + " " + lastName);
    }
}
