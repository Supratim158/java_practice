package com.supratim;

import java.util.*;

public class pract {
    public static List<Integer> mergeAndSort(List<Integer> list1, List<Integer> list2) {
        List<Integer> merged = new ArrayList<>(list1);
        merged.addAll(list2);
        Collections.sort(merged);
        return merged;
    }

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(5, 1, 9);
        List<Integer> list2 = Arrays.asList(3, 7, 2);
//        pract p = new pract();
        List<Integer> result = mergeAndSort(list1, list2);
        System.out.println("Merged & Sorted List: " + result);
    }
}