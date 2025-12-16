package com.AnjaniJha.DSA.patterns;

import static java.lang.Math.min;

public class pattern22 {
    public static void main(String[] args) {
        pattern20(4);
    }

    public static void pattern20(int n) {
        //row
        for (int i = 0 ; i < 2 * n -1 ; i++) {
            for ( int j = 0 ; j < 2*n - 1 ; j++) {
                int top = i;
                int left = j;
                int right = (2*n - 2) - j;
                int down = ( 2*n - 2) - i;
                System.out.print(n - min(min(top, down) , min(left,right)));
            }
        }
        System.out.println();
    }
}
