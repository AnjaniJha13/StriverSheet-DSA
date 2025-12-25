package com.AnjaniJha.DSA.Sorting.Type2;

public class RecursiveInsertionSortwithn {
    void recursiveInsertionSort(int[] arr, int n) {
        // Base case
        if (n <= 1) return;

        // Sort first n-1 elements
        recursiveInsertionSort(arr, n-1);

        // Insert last element at its correct position
        int last = arr[n-1];
        int j = n-2;

        // Shift elements greater than 'last' one position ahead
        while (j >= 0 && arr[j] > last) {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = last;
    }
}
