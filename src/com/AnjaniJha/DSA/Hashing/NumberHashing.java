package com.AnjaniJha.DSA.Hashing;
import java.util.Scanner;

public class NumberHashing {
    public static void main(String[] args) {
        //fix array size before creating an array
        Scanner input = new Scanner(System.in);
        //Take the string
        System.out.println("Enter the size of an array: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        //Enter the elements of the array
        System.out.println("Please enter the elemenets: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        //Precompute range(12)
        int[] hash = new int[13];
        for(int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }

        //fetching as per query
        System.out.println("Enter number of queries:");
        int q = input.nextInt();
        while ( q-- > 0) {
            System.out.println("Enter number to query: ");
            int num = input.nextInt();
            if ( num >= 0 && num < hash.length) {
                System.out.println("Frequency: "+ hash[num]);
            }else {
                System.out.println("Number out of range");
            }

        }
        input.close();
    }

}
