package com.supratim;

import java.util.*;

public class ListUtility {

    public List<Integer> mrg(List<Integer> l1, List<Integer> l2, List<Integer> l3){
        ArrayList<Integer> merged = new ArrayList<>(l1);
        merged.addAll(l2);
        merged.addAll(l3);
        Collections.sort(merged);

        return merged;
    }

    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(45,0,89);
        List<Integer> l2 = Arrays.asList(54,20,69);
        List<Integer> l3 = Arrays.asList(5,10,9);

        ListUtility a = new ListUtility();
        List<Integer> result = a.mrg(l1,l2,l3);
//        List<Integer> result = mrg(l1,l2,l3);
        System.out.println(result);

    }

}
