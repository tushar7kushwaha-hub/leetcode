import java.util.*;
class Solution {
    public int deleteAndEarn(int[] nums) {
        if(nums.length<2)return nums[0];
        int max = 0; 
        for(int i :nums){ if(i>max) max = i; }
        int[] arr = new int[max+1];
        for(int i : nums){
            arr[i] += i;
        }
        int[] dp = new int[arr.length];
        dp[1] = arr[1];
        for(int i = 2; i<arr.length; i++){
            dp[i] = Math.max(dp[i-2]+arr[i], dp[i-1]);
        }
        return dp[arr.length-1];
    }
}