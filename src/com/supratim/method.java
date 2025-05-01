package com.supratim;


abstract class ShapeArea{
    public void Sm() {
        System.out.println("hello");
    }
    abstract public void area(int a, int b);
}

class Triangle extends ShapeArea{
    public void area(int h,int b){
        int ar = 2*(b*h);
        System.out.println(ar);
    }
}

class Rectangle extends ShapeArea{
    public void area(int l,int b){
        int ar = b*l;
        System.out.println(ar);
    }
}


public class method {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        Rectangle r = new Rectangle();
        t.area(10,5);
        r.area(5,3);
    }
}
