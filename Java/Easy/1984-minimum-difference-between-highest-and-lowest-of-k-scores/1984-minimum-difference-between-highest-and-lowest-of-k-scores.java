import java.util.*;
class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(k==1){
            return 0;
        }
        int minDiff = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i = k-1; i<nums.length; i++){
            int diff= nums[i] -  nums[i-(k-1)];
            minDiff = Math.min(minDiff, diff);
        }           
        return minDiff;
    }
}