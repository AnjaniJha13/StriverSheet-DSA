package com.AnjaniJha.DSA.BasicMaths;

public class Armstrong {
    public boolean isArmstrong(int n) {
        int original = n;
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        n = original;
        int sum = 0;

        // Calculate the sum of digits raised to the power of count
        while (n > 0) {
            int digit = n % 10;
            sum += (int) Math.pow(digit, count);
            n = n / 10;
        }

        // Check if sum equals the original number
        return sum == original;
    }
}
