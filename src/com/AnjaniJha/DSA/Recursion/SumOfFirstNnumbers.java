package com.AnjaniJha.DSA.Recursion;

public class SumOfFirstNnumbers {
        public int NnumbersSum(int N) {
            return helper(N,0);
        }

        private int helper(int i, int sum){
            if (i == 0) {
                return sum;
            }
            return helper(i-1,sum + i);
        }
}
