package com.xsis.day01.quiz;

import java.util.Scanner;

public class Quiz02 {
    static final int totalMatkul = 4;

    public static void main(String[] args) {
        double matkul1, matkul2, matkul3, matkul4, ratarata;
        String nama;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Nama: ");
        nama = scan.nextLine();
        System.out.print("Nilai Mata Kuliah Pertama: ");
        matkul1 = scan.nextDouble();
        System.out.print("Nilai Mata Kuliah Kedua: ");
        matkul2 = scan.nextDouble();
        System.out.print("Nilai Mata Kuliah Ketiga: ");
        matkul3 = scan.nextDouble();
        System.out.print("Nilai Mata Kuliah Keempat: ");
        matkul4 = scan.nextDouble();
        ratarata = (matkul1 + matkul2 + matkul3 + matkul4) / totalMatkul;
        System.out.println("Nilai rata-rata dari " + nama + " adalah: " + ratarata);
    }
}
