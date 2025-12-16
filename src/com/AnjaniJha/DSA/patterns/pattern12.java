package com.AnjaniJha.DSA.patterns;

public class pattern12 {
    public static void main(String[] args) {
        pattern12(4);
    }

    public static void pattern12(int n) {
        //row
        for (int i = 1; i <= n; i++) {
            // Left side: increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Spaces between the two number triangles
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Right side: decreasing numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
