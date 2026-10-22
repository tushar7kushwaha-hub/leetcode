class Solution {
    public boolean canJump(int[] nums) {
        int i = 0;
        int farthest = 0;
        while(i<nums.length){
            if(i>farthest){
                return false;
            }else{
                farthest = Math.max(farthest, i+nums[i]);
            }
            if(farthest>=nums.length-1)return true;  
            i++;          
        }
        return true;
    }
}