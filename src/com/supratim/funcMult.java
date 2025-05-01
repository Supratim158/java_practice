package com.supratim;
import java.util.*;

public class funcMult {
    public static int mult2No(int x, int y){
        int mult = x*y;
        return mult;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 no");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = mult2No(a,b);
        System.out.println("the mult of "+ a + " & "+ b + ": " + sum);

    }
}