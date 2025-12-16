package com.AnjaniJha.DSA.patterns;

public class pattern8 {
    public static void main(String[] args) {
        pattern8(5);
    }

    public static void pattern8(int n) {
        //row
        for ( int i = 0;i < n; i++) {
            //column - space
            for ( int j = 0; j < i ; j++) {
                System.out.print(" ");
            } // *
            for ( int j = 0; j < 2*n - (2*i+1) ; j++) {
                System.out.print("*");
            } // space
            for ( int j = 0; j < i ; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
