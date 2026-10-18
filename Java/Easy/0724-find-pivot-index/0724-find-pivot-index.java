class Solution {
    public int pivotIndex(int[] nums) {
        int[] pre = new int[nums.length];
        int sum = 0;
        for(int n=0;n<nums.length;n++){
            sum+=nums[n];
        }       
        int leftsum = 0;
        for(int n=0;n<nums.length;n++){
            int rightsum = sum - nums[n] - leftsum;
            if(rightsum == leftsum)return n;
            leftsum+=nums[n];
        }
        return -1;
    }
}