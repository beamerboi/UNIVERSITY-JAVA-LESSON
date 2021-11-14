package com.company;

public class Habitation {
    String prop, adrs;
    double surf;

    Habitation(String P, String A, double S) {
        this.prop = P;
        this.adrs = A;
        this.surf = S;
    }
    public double Impot(){
        return surf * 2;
    }
    public boolean plusDImport(Habitation H){
        if(H.Impot()>this.Impot()){
            return false;
        }
        else{
            return true;
        }
    }
    public static double Impot(Habitation H){
        return H.Impot();
    }
    public String toString(){
        return "Habitation à "+adrs+" dont la surface est "+surf+" m² et le propriétaire est "+ prop;
    }
}
