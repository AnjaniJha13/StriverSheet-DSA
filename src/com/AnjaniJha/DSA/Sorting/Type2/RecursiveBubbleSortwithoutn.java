package com.AnjaniJha.DSA.Sorting.Type2;
import java.util.Arrays;

public class RecursiveBubbleSortwithoutn {
    static void bubbleSort(int[] arr) {
        bubbleSort(arr, arr.length);

    }
    private static  void bubbleSort(int[] arr, int n){
         //n = arr.length;
        //Base case
        if ( n == 1) return;

        for ( int i = 0; i < n - 1;i++) {
            if (arr[i] > arr[i + 1]) {
                //swap
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        bubbleSort(arr,n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {64,85,34,12,22,11,90};
        bubbleSort(arr);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}