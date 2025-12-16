package com.AnjaniJha.DSA.patterns;

public class pattern10 {
    public static void main(String[] args) {
        pattern10(5);
    }

    public static void pattern10(int n) {
        //row
        for ( int i = 0;i < 2*n; i++) {
            int totaljIni = i > n ? 2*n - i : i;
            for (int j = 0; j < totaljIni ; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
