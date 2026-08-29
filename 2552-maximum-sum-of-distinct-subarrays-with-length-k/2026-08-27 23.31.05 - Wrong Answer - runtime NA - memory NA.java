class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        int l = 0;
        int r = k-1;
        int repeatedCounter = 0;
        int sum = 0;
        int maxSum = 0;
        
        while (r<n){
            for(int i=l; i<r;i++){
                if(nums[i]==nums[i+1]){
                    repeatedCounter++;
                }
            }
            for(int i = l; i<=r;i++){
                sum+=nums[i];
            }
            if(repeatedCounter==0){
                if(sum>maxSum) maxSum = sum;
                repeatedCounter=0;
                sum=0;
            }
            l++;
            r++;
        }
        return maxSum;
    }
}