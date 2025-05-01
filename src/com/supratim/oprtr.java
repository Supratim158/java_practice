package com.supratim;

public class oprtr {
    public static void main(String[] args){
        int a = 20;
        int b = 40;
        if(a<50 && b<50){
            System.out.println("both less than fifty");
            if(a>20 || b>20){
                System.out.println("atleast one greater than 20");

            }
        }
        boolean isAdult = false;
        if(!isAdult)
            System.out.println("adult");
        else
            System.out.println("not adult");

        if(isAdult)
            System.out.println("adult");
        else
            System.out.println("not adult");
    }
}
