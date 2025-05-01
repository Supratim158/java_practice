package com.supratim;

interface Bicycle{

    void applyBrake(int decrement);
    void applySpeed(int increment);

}
interface BlowHorn{

    void h1();
    void h2();

}

class Avon implements Bicycle , BlowHorn{
    int speed = 10;
    public void applyBrake(int decrement){
        speed -= decrement;
        System.out.println("decrement" +speed);
    }
    public void applySpeed(int increment){
        speed += increment;
        System.out.println("increment" +speed);
    }
    public void h1(){
        System.out.println("pee pee pee");
    }
    public void h2(){
        System.out.println("poo poo poo");
    }
}

public class interface_class {
    public static void main(String[] args) {
        Avon a = new Avon();
        a.applyBrake(5);
        a.applySpeed(5);
        a.h1();
        a.h2();
    }
}
