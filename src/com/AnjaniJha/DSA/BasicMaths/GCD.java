package com.AnjaniJha.DSA.BasicMaths;

public class GCD {
    public int gcdoftwonumbers(int n1, int n2) {
        int gcd = 1;
        int i = 2;
        int least = least (n1 , n2);
        while ( i <= least){
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
            i++;
        }
        return gcd;
    }
    public static int least(int n1,int n2) {
        if(n1 < n2) {
            return n1;
        }else {
            return n2;
        }
    }
}
