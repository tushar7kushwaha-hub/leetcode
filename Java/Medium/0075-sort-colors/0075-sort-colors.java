class Solution {
    public void sortColors(int[] nums) {
        int slow = 0;
        int fast = 0;
        for(; fast<nums.length; fast++){
            if(nums[slow]==0){
                slow++;
                continue;
            }
            if(nums[fast] == 0){
                int tmp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = tmp;
                slow++;
            }
        }
        for(fast = slow; fast<nums.length; fast++){
            if(nums[slow]==1){
                slow++;
                continue;
            }
            if(nums[fast]==1){
                int tmp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = tmp;
                slow++;
            }
        }
    }
}