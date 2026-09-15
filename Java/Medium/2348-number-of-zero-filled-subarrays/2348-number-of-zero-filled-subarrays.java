class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count = 0;
        int left = 0;
        int right = 0;
        while(right<nums.length){
            if(nums[right] == 0){
                left=right;
                while(right<nums.length&&nums[right] == 0)right++;
                long len = right-left+1;
                if(len>1){
                    count+=(len*(len-1));
                }else{
                    count++;
                }
                continue;
            }            
            right++;
        }
        return count/2;
    }
}