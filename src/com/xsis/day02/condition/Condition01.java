package com.xsis.day02.condition;

public class Condition01 {
    public static void main(String[] args) {
        /*String a, b, c;
        a = "xsis";
        b = "xsis";
        c = "hello";
        if (a.equals(b)){
            System.out.println("Object String Equal");
        } else {
            System.out.println("Object String beda");
        }

        //   negation
        if (!a.equals(c)){
            System.out.println("true");
        } else{
            System.out.println("false");
        }*/

        //  cari siswa umur > 20 dan ipk > 3.01 dan < 3.5
        int umur = 21;
        double ipk = 3.05;
        if (umur > 20 && ipk > 3.01 && ipk < 3.5){
            System.out.println("Found!");
        } else{
            System.out.println("Not Found!");
        }
    }
}
