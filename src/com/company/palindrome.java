package com.company;

public class palindrome {
    static String inverse(String str){
        char ch[] = str.toCharArray();
        String rev ="";

        for(int i=str.length()-1;i>=0; i--){
            rev+=ch[i];
        }
        return rev;
    }
    public static void main(String[] args) {
        String str = "laval";
        if (str.equals(inverse(str))){
            System.out.println("polandrome");
        }
        else{
            System.out.println("Invalid");
        }




    }

}
