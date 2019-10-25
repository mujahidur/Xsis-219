package com.xsis.day01.pr;

import java.util.Scanner;

public class pr05 {
    public static void main(String[] args) {
        int nilai, week, day, hour, minute, second, sisa;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        nilai = scan.nextInt();

        week = (int)nilai / 604800;
        sisa = (int)nilai % 604800;

        day = (int)sisa / 86400;
        sisa = (int)sisa % 86400;

        hour = (int)sisa / 3600;
        sisa = (int)sisa % 3600;

        minute = (int)sisa / 60;
        sisa = (int)sisa % 60;

        second = sisa;

        System.out.println("Sisa waktu anda adalah: " + week + " Minggu " + day + " Hari "
                + hour + " Jam " + minute + " Menit dan " + second + " Detik");
    }
}
