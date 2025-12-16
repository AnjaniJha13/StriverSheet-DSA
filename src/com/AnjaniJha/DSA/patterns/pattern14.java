package com.AnjaniJha.DSA.patterns;

public class pattern14 {
    public static void main(String[] args) {
        pattern14(5);
    }

    public static void pattern14(int n) {
        for ( int i = 1;i <= n; i++) {
            for ( char ch = 'A' ; ch < 'A' + i ; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
