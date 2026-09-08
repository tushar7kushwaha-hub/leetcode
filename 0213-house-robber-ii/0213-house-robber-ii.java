class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        if(n==2) return Math.max(nums[0], nums[1]);

        // array 1st
        int[] nums1 = new int[n-1];
        for(int k = 0; k<n-1; k++){
            nums1[k] = nums[k];
        }
        int[] dp = new int[n];
        dp[0] = nums1[0];
        dp[1] = Math.max(nums1[0], nums1[1]);
        for(int i = 2; i<n-1; i++){
            dp[i] = Math.max(dp[i-1],dp[i-2]+nums1[i]);        
        } 

        // array 2nd
        int[] dp1 = new int[n];
        dp1[1] = nums[1];
        dp1[2] = Math.max(nums[1], nums[2]);
        for(int i = 3; i<n; i++){
            dp1[i] = Math.max(dp1[i-1],dp1[i-2]+nums[i]);        
        }  
        
        int maxIndp =  Integer.MIN_VALUE;
        int maxIndp1 = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            if(dp[i]>maxIndp){
                maxIndp = dp[i];
            }
            if(dp1[i]>maxIndp1){
                maxIndp1 = dp1[i];
            }
        }
        return Math.max(maxIndp, maxIndp1);
    }
}