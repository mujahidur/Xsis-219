package com.xsis.day02.string;

public class String06 {
    public static void main(String[] args) {
        String s, r;
        s = "Hello Java Programmer";
        System.out.println("Input   : " + s);
        r = s.substring(11,21) + " " + s.substring(0,5) + s.substring(5,10);
        System.out.println("Reverse : " + r);
    }
}
