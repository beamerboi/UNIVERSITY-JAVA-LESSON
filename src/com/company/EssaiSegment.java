package com.company;

public class EssaiSegment {
    public static void main(String[] args){
        Segment seg = new Segment(44, -35);
        seg.ordonne();
        seg.appartient(8);
        System.out.println(seg.get_longeur());
        System.out.println(seg.toString());
    }
}
