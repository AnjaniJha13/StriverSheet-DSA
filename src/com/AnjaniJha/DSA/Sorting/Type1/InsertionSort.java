package com.AnjaniJha.DSA.Sorting.Type1;
import java.util.Scanner;
import java.util.Arrays;

public class InsertionSort {
        public int[] insertionSort(int[] nums) {
            int n = nums.length;

            for ( int i = 1; i < n ; i++) {
                for ( int j = i ; j > 0; j--) {
                    if (nums[j - 1] > nums[j]) {

                        //swap
                        int temp = nums[j];
                        nums[j] = nums[j - 1];
                        nums[j - 1] = temp;
                    }
                }
            }
            return nums;

        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }

            InsertionSort sol = new InsertionSort ();              // create object
            int[] sorted = sol.insertionSort(nums);     // call via object
            System.out.println(Arrays.toString(sorted));

    }
}
