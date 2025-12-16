package com.AnjaniJha.DSA.patterns;

public class pattern16 {
    public static void main(String[] args) {
        pattern14(5);
    }
//    for ( int j = 1; j <= i ; j++) {
//        System.out.print(i + " ");
//    }

    public static void pattern14(int n) {
        for ( int i = 1;i <= n; i++) {
            char ch = (char)  ('A' + i - 1);
            for ( int j = 0; j < i ; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
