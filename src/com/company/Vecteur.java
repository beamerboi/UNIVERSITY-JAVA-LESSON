package com.company;
import java.lang.Math;

public class Vecteur {
    private int val1, val2;

    Vecteur(int val1, int val2){
        this.val1 = val1;
        this.val2 = val2;
    }

    public double longeur(){
        return Math.sqrt((double)(val1*val1)+(double)(val2*val2));
    }
    public void addition(Vecteur vec){
        double my_vec = longeur();
        System.out.println(vec.longeur()+my_vec);
    }
    static Vecteur addition(Vecteur vec1, Vecteur vec2){
        Vecteur my_vec = new Vecteur(vec1.getVal1(), vec1.getVal2());
        vec1.addition(vec2);
        return vec1;
    }
    public String toString(){
        return "vecteur ("+val1+", "+val2+")";
    }
    public int getVal1(){
        return val1;
    }
    public int getVal2(){
        return val1;
    }

}
