import java.util.HashSet;
class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        int l = 0;
        int r = k-1;
        int sum = 0;
        int maxSum = 0;
        int flag = 0;
        
        while (r<nums.length){
            for(int i = l; i<=r;i++){
                set.add(nums[i]);
                sum+=nums[i];
            }
            if(set.size()<k){
                    flag = 1;
            }
            if(flag==0){
                if(sum>maxSum){
                    maxSum = sum;
                }
            }
        
            flag=0;   
            sum=0;
            l++;
            r++;
            set.clear();
        }
        return maxSum;
    }
}