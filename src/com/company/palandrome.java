package com.company;

public class palandrome {
    String str = "laval";
    String str2 = str;
    boolean check = false;


    public static void inverse(String str){
        Character[] str_tab;
        str_tab = new Character[str.length()] ;
        String temp = "";
        for(int i=str.length(); i>=0; i--){
            str_tab[str.length()-i] = str.charAt(i);
        }
        for(int i=0; i<str_tab.length;i++){
            temp+=str_tab[i];
        }
        System.out.println(temp);
    }

}
