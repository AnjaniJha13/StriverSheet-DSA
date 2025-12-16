package com.AnjaniJha.DSA.patterns;

public class pattern20 {
    public static void main(String[] args) {
        pattern20(5);
    }

    public static void pattern20(int n) {
        //row
        int space = 2*n - 2;
        for (int i = 1; i <= 2*n-1; i++) {
            //column
            int stars = i;
            if ( i > n) stars = 2 * n - i;
            // stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            //spaces
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            if( i < n) space -= 2;
            else space += 2;
            System.out.println();
        }
    }
}
