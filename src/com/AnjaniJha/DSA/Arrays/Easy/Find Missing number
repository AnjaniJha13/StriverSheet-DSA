class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int missingnum = 0;

        Arrays.sort(nums);

        for(int i = 0 ; i < n -1 ; i++) {
            if (nums[i + 1] != nums[i] + 1) {   // check for gap
                missingnum = nums[i] + 1;
                return missingnum;              // return immediately when found
            }

        }
        return nums[n - 1] + 1;
        
    }
}
