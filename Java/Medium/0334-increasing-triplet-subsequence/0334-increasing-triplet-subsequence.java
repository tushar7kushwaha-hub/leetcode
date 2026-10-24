class Solution {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length<3)return false;
        int first = Integer.MAX_VALUE;
        int sec = Integer.MAX_VALUE;
        for(int i=0; i<nums.length;i++){
            if(first>=nums[i]){
                first = nums[i];
            }else if(nums[i]<=sec){
                sec = nums[i];
            }else if(nums[i]> first && nums[i]>sec){
                return true;
            }
        }
        return false;
    }
}