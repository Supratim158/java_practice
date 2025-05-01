package com.supratim;

import java.util.Arrays;

public class array {
    public static void main(String[] args){

        // 1d array

//        int [] marks ={100,97,95};
        //or
        int[] marks = new int[5];
        marks[0]=100;
        marks[1]=97;
        marks[2]=95;
        System.out.println(marks[0]);
        System.out.println(marks[3]);
        System.out.println(marks.length);
        Arrays.sort(marks);
        System.out.println(marks[2]);


        //2d array


//         int [][] m2 ={{99,98,94},{89,99,87}};
        int[][] m2 = new int[2][3];
        m2[0][0]=100;
        m2[0][1]=99;
        m2[0][2]=98;
//        m2[0][3]=1;
        m2[1][0]=100;
        m2[1][1]=100;


    }
}
