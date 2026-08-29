import java.util.HashSet;
class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        int l = 0;
        int r = k-1;
        int sum = 0;
        int maxSum = 0;
        int flag = 0;
        for(int i = l; i<=r; i++){
            sum+=nums[i];
        }
        while (r<nums.length){
            for(int i = l; i<=r;i++){
                set.add(nums[i]);
            }
            if(set.size()<k){
                flag=1;
            }
            if(sum>maxSum && flag==0){
                maxSum = sum;
            }
            flag=0;
            l++;
            r++;
            sum-=nums[--l];
            sum+=nums[r];
            set.clear();
        }
        return maxSum;
    }
}