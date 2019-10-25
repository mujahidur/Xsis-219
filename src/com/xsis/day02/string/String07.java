package com.xsis.day02.string;

import javax.swing.table.TableRowSorter;
import java.util.Scanner;

public class String07 {
    public static void main(String[] args) {
        String username;
        double s;
        Scanner scan = new Scanner(System.in);
        System.out.print("Usernama: ");
        username = scan.nextLine();
        System.out.println("------------------------------");
        //  tips membuat angka random adalah di kali 1000 atau kelipatan 10
        //  karena Math.random() akan memunculkan angka dari 0, atau 1,
        s = Math.random() * 1000 ;
        System.out.println("Hasilnya: " + username.substring(0,4) + Math.round(s));
    }
}
