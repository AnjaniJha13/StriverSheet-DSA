package com.AnjaniJha.DSA.patterns;

public class pattern9 {
    public static void main(String[] args) {
        pattern9(5);
    }

    public static void pattern9(int n) {
        //Upper half(patter7)
        //row
        for (int i = 0; i < n; i++) {
            //column - space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            } // *
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            } // space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        //Lower Half(pattern8)       
        for (int i = 0; i < n; i++) {
                //column - space
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                } // *
                for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
                    System.out.print("*");
                } // space
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }

