package com.AnjaniJha.DSA.Recursion;
//Print names n times using recursion

import java.util.Scanner;

public class Ntimes {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the number of times you want to print your name: ");
            int n = input.nextInt();
            String name = "Anjani";
            printName(n,name);
    }

            public static void printName(int n , String name) {
        if (n == 0) {
            return;
        }
        System.out.println(name);
        printName(n-1,name);
        }
}
