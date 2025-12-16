package com.AnjaniJha.DSA.patterns;

public class pattern7 {
    public static void main(String[] args) {
        pattern7(5);
    }

    public static void pattern7(int n) {
        //row
        for ( int i = 0;i < n; i++) {
            //column - space
            for ( int j = 0; j < n-i-1 ; j++) {
                System.out.print(" ");
            } // *
            for ( int j = 0; j < 2*i+1 ; j++) {
                System.out.print("*");
            } // space
            for ( int j = 0; j < n-i-1 ; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
