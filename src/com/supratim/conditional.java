package com.supratim;

import java.util.Scanner;

public class conditional {
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter age : ");
        int age = sc.nextInt();
        if(age >= 18)
            System.out.println("Can vote");
        else if (age<10)
            System.out.println("u are a baby");
        else
            System.out.println("Can't vote");
    }
}
