package com.AnjaniJha.DSA.patterns;

public class pattern5 {
    public static void main(String[] args) {
        pattern5(5);
    }

    public static void pattern5(int n) {
        for ( int i = 1;i <= n; i++) {
            for ( int j = 1; j <= n - i + 1 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
