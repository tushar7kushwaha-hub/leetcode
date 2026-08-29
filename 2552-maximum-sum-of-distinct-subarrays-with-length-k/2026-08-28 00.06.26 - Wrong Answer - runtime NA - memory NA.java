import java.util.HashSet;
class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        int l = 0;
        int r = k-1;
        int sum = 0;
        int maxSum = 0;
        while (r<nums.length){
            if(l==0){
                for(int i = l; i<=r;i++){
                    sum+=nums[i];
                }
            }
            for(int i = l; i<=r;i++){
                set.add(nums[i]);
            }
            if(set.size()<k){
                break;
            }
            if(sum>maxSum){
                maxSum = sum;
            }
            sum-=nums[l];
            l++;
            r++;
            sum+=nums[r];
            set.clear();
        }
        return maxSum;
    }
}