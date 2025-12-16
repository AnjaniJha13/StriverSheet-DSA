package com.AnjaniJha.DSA.patterns;

public class pattern17 {
    public static void main(String[] args) {
        pattern17(5);
    }

    public static void pattern17(int n) {
        //row
        for ( int i = 0;i < n; i++) {
            //column - space
            for ( int j = 0; j < n-i-1 ; j++) {
                System.out.print(" ");
            }
            // characters
            char ch = 'A';
            int breakpoint = (2 * i + 1) /2;
            for ( int j = 1; j <= 2*i+1 ; j++) {
                System.out.print(ch);
                if(j <= breakpoint) ch++;
                else ch--;
            } // space
            for ( int j = 0; j < n-i-1 ; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
