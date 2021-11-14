package com.company;
import static java.lang.Integer.parseInt;

public class Fact {
    public static void main(String[] args) {

    int n = parseInt(args[0]);

        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println(fact);
    }
}
