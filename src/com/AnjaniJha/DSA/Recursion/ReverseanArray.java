package com.AnjaniJha.DSA.Recursion;

public class ReverseanArray {
        public void reverse(int[] arr, int n) {
                    helper(arr, 0, n - 1);
                }

                private void helper(int[] arr, int left, int right) {
                    if (left >= right) {
                        return; // base case
                    }

                    // swap
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;

                    // recursive call
                    helper(arr, left + 1, right - 1);

            //using while loop

//            int i = 0;
//            while(i < n/2){
//                int swap = arr[i];
//                arr[i] = arr[(n-1)-i];
//                arr[(n-1)-i] = swap;
//                i++;
//
//            }

        }

    }



