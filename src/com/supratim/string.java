package com.supratim;

public class string {
    public static void main(String[] args) {
// Strings immutable
        String a1 = "Supratim";
        String a2 = "Modak";
        String a3 = a1+ " " +a2;// Concatenate
        System.out.println(a3);
        System.out.println(a3.charAt(3));// tell the position
        String a4 = a3.replace('a','b');// replace makes a new string and change the string
        System.out.println(a4);
        System.out.println(a3.substring(4,11));
    }
}
