package com.AnjaniJha.DSA.Sorting.Type2;
import java.util.Arrays;

public class QuickSort {
    public int[] quickSort(int[] nums) {
        quicksorting(nums, 0, nums.length - 1);
        return nums;
    }

    private void quicksorting(int[] nums, int start, int end) {
        if (start < end) {
            int partitionIndex = partition(nums, start, end);
            quicksorting(nums, start, partitionIndex - 1);
            quicksorting(nums, partitionIndex + 1, end);
        }
    }

    // Partition using first element as pivot
    private int partition(int[] nums, int start, int end) {
        int pivot = nums[start];   // first element as pivot
        int i = start + 1;
        int j = end;

        while (i <= j) {
            // move i forward until we find element greater than pivot
            while (i <= end && nums[i] <= pivot) {
                i++;
            }
            // move j backward until we find element smaller than pivot
            while (j >= start && nums[j] > pivot) {
                j--;
            }
            // swap if i and j haven't crossed
            if (i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        // place pivot at its correct position
        nums[start] = nums[j];
        nums[j] = pivot;

        return j;  // pivot index
    }

    // Quick test
    public static void main(String[] args) {
        QuickSort sol = new QuickSort ();
        int[] nums1 = {7, 4, 1, 5, 3};
        int[] nums2 = {5, 4, 4, 1, 1};

        System.out.println(Arrays.toString(sol.quickSort(nums1))); // [1, 3, 4, 5, 7]
        System.out.println(Arrays.toString(sol.quickSort(nums2))); // [1, 1, 4, 4, 5]
    }
}