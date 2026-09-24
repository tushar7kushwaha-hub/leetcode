class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1)return 0;
        int count = 0;
        int right = 0; int left = 0;
        int winPro = 1;
        while(right<nums.length){
            winPro *= nums[right];
            while(winPro>=k){
                winPro/=nums[left++];
            }
            count+= right-left+1;
            right++;
        }
        return count;
    }
}