class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length-1;
        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;
        int sum = 0;
        int minSum = Integer.MAX_VALUE;
        int curMin = 0;
        for(int i = 0; i<=n; i++){
            sum+=nums[i];

            curSum = Math.max(nums[i], curSum+nums[i]);
            maxSum = Math.max(curSum, maxSum);
            if(curSum<0)curSum=0;

            curMin = Math.min(nums[i], curMin+nums[i]);
            minSum = Math.min(curMin, minSum);
            if(curMin>0)curMin = 0;
        }
        if(sum==minSum)return maxSum;
        return Math.max(maxSum, sum-minSum);
    }
}