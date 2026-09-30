
class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0;
        int right = 0;
        int zeroC = 0;
        int len = 0;
        for(;right<nums.length;right++){
            if(nums[right]==0){
                zeroC++;
            }
            if(zeroC>k){
                while(zeroC>k){
                    if(nums[left]==0){
                        zeroC--;
                    }
                    left++;
                }
            }
            len = Math.max(len, right-left+1);
        }
        return len;
    }
}