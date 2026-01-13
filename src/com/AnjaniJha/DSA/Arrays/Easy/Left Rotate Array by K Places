class Solution {
    public void rotateArray(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        int[] temp = new int[n];

        for(int i = 0; i < n - k ; i++) {
            temp[i] = nums[i + k];
        }

        for(int i = 0; i < k ;i++) {
            temp[n - k + i] = nums[i];
        }

        for (int i = 0; i < n ; i++) {
             nums[i] = temp[i];
        }
        
    }
}
