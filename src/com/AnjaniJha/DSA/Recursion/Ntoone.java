package com.AnjaniJha.DSA.Recursion;

public class Ntoone {
    public void printNumbers(int n) {
        print(n,n);

    }
    private void print(int n,int i) {
        if(i == 0) {
            return;
        }
        System.out.println(n);
        print(n,i-1);
    }

}
