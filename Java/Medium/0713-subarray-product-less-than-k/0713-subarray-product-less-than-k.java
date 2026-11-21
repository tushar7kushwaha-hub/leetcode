class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0;
        int ans = 1;
        int l = 0;
        int r = 0;
        int count = 0;
        while(r<nums.length){
            ans*=nums[r];
            while(ans>=k){
                ans/=nums[l++];
            }       
            count+=r-l+1;
            r++;                 
        }
        return count;
    }
}