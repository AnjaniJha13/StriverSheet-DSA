package com.AnjaniJha.DSA.BasicMaths;

public class CountDigits {
    public int countDigit(int n) {
        int count = 0;
        while ( n > 0) {
            count ++;
            n = n /10;
        }
        return count++;
    }
}
