package com.supratim;

import java.util.Scanner;

public class funcFact {
    public static void calcFact(int n){
        if(n<0){
            System.out.println("Inavalid no");
            return;
        }
        int f =1;
        for(int i=n; i>=1;i--){
            f*=i;
        }
        System.out.println("the factorial of "+n+"is "+ f);
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a no :");
        int n = sc.nextInt();
        calcFact(n);
    }
}

