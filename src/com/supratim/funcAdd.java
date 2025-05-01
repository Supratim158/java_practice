package com.supratim;
import java.util.*;

public class funcAdd {
    public static int sum2No(int x, int y){
        int sum = x+y;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 no");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = sum2No(a,b);
        System.out.println("the sum of "+ a + " & "+ b + ": " + sum);

    }
}