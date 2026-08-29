class Solution {
    public int searchInsert(int[] nums, int target) {
        int indxpos = nums.length;

        for(int i = 0; i < nums.length; i++){
            if(nums[i]==target){
                return i;
            }
            if(nums[i]>target){
                return i;
            }
            
            
        }
        return indxpos;
    }
}