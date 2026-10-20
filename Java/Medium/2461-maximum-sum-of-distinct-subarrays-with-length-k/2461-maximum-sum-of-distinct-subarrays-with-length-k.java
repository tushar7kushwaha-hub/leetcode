import java.util.*;
class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        long sum = 0;
        long maxSum = 0;
        for(int i=0;i<k;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            sum+=nums[i];
        }
        if(map.size()==k){
            maxSum = Math.max(maxSum, sum);
        }

        int left = 1;
        int right = k;
        for(;right<nums.length; right++){
            if(map.get(nums[left-1]) == 1){
                map.remove(nums[left-1]);
            }else{
                map.put(nums[left-1], map.get(nums[left-1])-1);
            }
            map.put(nums[right], map.getOrDefault(nums[right], 0)+1);
            sum-=nums[left-1];
            sum+=nums[right];

            if(map.size() == k){
                maxSum = Math.max(maxSum, sum);
            }
            left++;
        }
        return maxSum;
    }
}