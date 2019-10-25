package com.xsis.day02.string;

public class String04 {
    public static void main(String[] args) {
        String s, st;
        s = "Hello, .NET Developer Welcome to Xsis Academy";
        System.out.println(s);

        st = s.replace(".NET", "JAVA");
        System.out.println("replace #1: " + st);

        st = st.replace("Welcome", "Hello");
        System.out.println("Replace #2: " + st);

        // Replace
        st = st.replace("Developer", "Jazz")
                .replace("Xsis", "Warung")
                .replace("Academy", "Kopi");
        System.out.println("Replace banyak: " + st);

        // toUpperCase & toLowerCase
        st = st.replace("Developer", "Jazz")
                .replace("Xsis", "Warung")
                .replace("Academy", "Kopi").toUpperCase();
        System.out.println("Replace UpperCase: " + st);
    }
}
