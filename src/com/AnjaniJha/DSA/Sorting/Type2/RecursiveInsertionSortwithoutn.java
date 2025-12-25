package com.AnjaniJha.DSA.Sorting.Type2;

public class RecursiveInsertionSortwithoutn {
    void recursiveInsertionSort(int[] arr) {
        recursiveInsertionSortHelper(arr, 1); // start from index 1
    }

    void recursiveInsertionSortHelper(int[] arr, int i) {
        // Base case: if we've reached the end of the array
        if (i >= arr.length) return;

        // Sort first i elements recursively
        recursiveInsertionSortHelper(arr, i - 1);

        // Insert arr[i] into the sorted subarray arr[0..i-1]
        int key = arr[i];
        int j = i - 1;

        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = key;

        // Move to the next element
        recursiveInsertionSortHelper(arr, i + 1);
    }
}
