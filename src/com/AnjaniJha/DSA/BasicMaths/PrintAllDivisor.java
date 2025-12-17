package com.AnjaniJha.DSA.BasicMaths;
import java.util.ArrayList;
import java.util.List;

public class PrintAllDivisor {
    public int[] divisors(int n) {
        List<Integer> factors = new ArrayList<>();
        for ( int i = 1; i <= n ; i++) {
            if ( n % i == 0) {
                factors.add(i);
            }
        }
        // Convert List<Integer> to int[]
        int[] result = new int[factors.size()];
        for (int i = 0; i < factors.size(); i++) {
            result[i] = factors.get(i);
        }
        return result;
    }
}
