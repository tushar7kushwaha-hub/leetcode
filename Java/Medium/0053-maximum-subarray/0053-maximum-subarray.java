class Solution {
    public int maxSubArray(int[] nums) {
        int gMax = nums[0];
        int cMax = nums[0];
        for(int i = 1; i<nums.length; i++){
            cMax = Math.max(nums[i], cMax+nums[i]);
            gMax = Math.max(cMax, gMax);
        }
        return gMax;
    }
}