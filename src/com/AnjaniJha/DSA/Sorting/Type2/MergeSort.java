package com.AnjaniJha.DSA.Sorting.Type2;

import java.util.Arrays;

public class MergeSort {
        public int[] mergeSort(int[] nums) {
            mergesorting(nums , 0 , nums.length - 1);
            return nums;
        }

        private void mergesorting(int[] nums, int start , int end) {
            if ( start >= end) return;

            int mid = (start + end) /2;
            mergesorting(nums, start ,mid);
            mergesorting(nums, mid + 1, end);
            merge(nums , start , mid , end);
        }
        //merging 2 halves arrays
        private void merge(int[] nums, int start , int mid , int end) {
            int[] temp = new int[end - start + 1];
            int left = start;
            int right = mid + 1;
            int index = 0;

            while (left <= mid && right <= end) {
                if (nums[left] <= nums[right]) {
                    temp[index++] = nums[left++];
                }else {
                    temp[index++] = nums[right++];
                }
            }

            //Copy remaining elements

            while (left <= mid) {
                temp[index++] = nums[left++];
            }
            while (right <= end) {
                temp[index++] = nums[right++];
            }

            //Copy back to original array
            for (int i = 0; i < temp.length ; i++) {
                nums[start + i] = temp[i];
            }
        }

        public static void main(String[] args) {
            MergeSort sol = new  MergeSort();
            int[] nums1 = {7, 4, 1, 5, 3};
            int[] nums2 = {5, 4, 4, 1, 1};

            nums1 = sol.mergeSort(nums1);
            nums2 = sol.mergeSort(nums2);

            System.out.println(Arrays.toString(nums1)); // [1, 3, 4, 5, 7]
            System.out.println(Arrays.toString(nums2)); // [1, 1, 4, 4, 5]
        }
    }


