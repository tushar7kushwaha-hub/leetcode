class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        if(nums.length<2){
            if(nums[0]>=target)return 1; 
            return 0;
        }
        int minLength = Integer.MAX_VALUE;
        int left = 0; int right = 0;
        int sum = nums[left];
        while(right<nums.length){
            if(sum<target){
                right++;
                if(right<nums.length)
                    sum+=nums[right];
                continue;
            }else if(sum>target){
                minLength = Math.min(minLength, right-left+1);
                sum-=nums[left];
                left++;
                continue;
            }else{
                minLength = Math.min(minLength, right-left+1);
                right++;
                if(right<nums.length) sum+=nums[right];
                continue;
            }
        }
        if(minLength<Integer.MAX_VALUE){
            return minLength;
        }else return 0;
    }
}