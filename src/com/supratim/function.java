package com.supratim;
import java.util.*;

public class function {
    public static void printmyName(String name){
        System.out.println(name);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name= sc.next();
        printmyName(name);
    }
}
