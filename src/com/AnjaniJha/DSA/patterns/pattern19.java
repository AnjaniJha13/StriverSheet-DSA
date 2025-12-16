package com.AnjaniJha.DSA.patterns;

public class pattern19 {
    public static void main(String[] args) {
        pattern19(5);
    }

    public static void pattern19(int n) {
        //row
        int space = 0;
        for (int i = 0; i < n; i++) {
            //column
            // stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            //spaces
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            space += 2;
            System.out.println();
        }

            //row
            space = 8;
            for (int i = 1; i <= n; i++) {
                //column
                // stars
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                //spaces
                for (int j = 0; j < space; j++) {
                    System.out.print(" ");
                }
                //stars
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                space -= 2;
                System.out.println();
            }
        }
    }



