package com.company;
import java.lang.Math;

public class Segment {
    int ext1, ext2;

    Segment(int ext1, int ext2){
        this.ext1 = ext1;
        this.ext2 = ext2;
    }

    public void ordonne(){
        if (ext1 > ext2){
            int temp = ext1;
            ext1 = ext2;
            ext2 = temp;
        }
    }
    public int get_longeur(){
        return Math.abs(ext1)+Math.abs(ext2);
    }
    public void appartient(int x){
        if(ext2>ext1){
            if((x<=ext2)&&(x>=ext1)){
                System.out.println(x+" appartient au segment");
            }
            else{
                System.out.println(x+" n'appartient pas au segment");
            }
        }
        else{
            if((x>=ext2)&&(x<=ext1)){
                System.out.println(x+" appartient au segment");
            }
            else{
                System.out.println(x+" n'appartient pas au segment");
            }
            }

    }
    public String toString(){
        return "segment ["+ext1+", "+ ext2+"]";
    }
}
