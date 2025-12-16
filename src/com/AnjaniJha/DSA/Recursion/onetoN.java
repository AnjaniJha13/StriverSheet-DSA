package com.AnjaniJha.DSA.Recursion;

public class onetoN {
    public void printNumbers(int n) {
        print(1,n);
    }
    private void print(int n,int i) {
        if (i > n) {
            return;
        }
        System.out.println(i);
        print(i + 1,n);
    }

    }
