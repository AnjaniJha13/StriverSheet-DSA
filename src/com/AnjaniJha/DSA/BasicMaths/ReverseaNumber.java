package com.AnjaniJha.DSA.BasicMaths;

public class ReverseaNumber {
    public int reverse(int n) {
        int reversenum = 0;
        while (n > 0) {
            int lastdigit = n % 10;
            reversenum = reversenum * 10 + lastdigit;
            n = n / 10;
        }
        return reversenum;

    }


}
