class Solution {
    public int maxProduct(int[] nums) {
        int curMax = nums[0];
        int curMin = nums[0];
        int gMax = nums[0];
        for(int i=1;i<nums.length;i++){
            int num = nums[i];
            if(num<0){
                int tmp = curMax;
                curMax = curMin;
                curMin = tmp;
            }
            curMax = Math.max(num, num*curMax);
            curMin = Math.min(num, num*curMin);
            gMax= Math.max(gMax,curMax);
        }
        return gMax;
    }
}