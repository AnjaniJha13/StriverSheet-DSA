package com.AnjaniJha.DSA.Sorting.Type1;
import java.util.Scanner;
import java.util.Arrays;

public class BubbleSort {
        public int[] bubbleSort(int[] nums) {
            int n = nums.length;

            for ( int i = n - 1; i >= 1 ; i--) {
                for ( int j = 0 ; j < i; j++) {
                    if (nums[j] > nums[j + 1]) {

                        //swap
                        int temp = nums[j];
                        nums[j] = nums[j + 1];
                        nums[j + 1] = temp;
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

            BubbleSort sol = new BubbleSort();              // create object
            int[] sorted = sol.bubbleSort(nums);     // call via object
            System.out.println(Arrays.toString(sorted));
        }
    }

