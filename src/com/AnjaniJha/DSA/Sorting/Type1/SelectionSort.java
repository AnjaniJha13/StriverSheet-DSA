package com.AnjaniJha.DSA.Sorting.Type1;
import java.util.Scanner;
import java.util.Arrays;

public class SelectionSort {
        public int[] selectionSort(int[] nums) {
            int n = nums.length;

            for ( int i = 0; i <= n-1 ; i++) {
                int min = i;
                for ( int j = i + 1; j < n; j++) {
                    if (nums[j]< nums[min]) {
                        min = j;
                    }

                }
                //swap
                int temp = nums[min];
                nums[min] = nums[i];
                nums[i] = temp;
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

            SelectionSort sol = new SelectionSort();              // create object
            int[] sorted = sol.selectionSort(nums);     // call via object
            System.out.println(Arrays.toString(sorted));

        }
    }

