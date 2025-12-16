package com.AnjaniJha.DSA.Recursion;

public class fibonacci {
    public int fib(int n) {
        if ( n <= 1) {
            return n;
        }
        return fib(n-1) + (n-2);

    }
}
