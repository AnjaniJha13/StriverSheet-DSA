class Solution {
    public int secondLargestElement(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        int i = nums[n - 1];
        
        for (int j = n - 2; j >= 0 ; j--) {
            if (nums[j] < i){
                return nums[j];
            }
        }
        
    return -1;
    }
}
