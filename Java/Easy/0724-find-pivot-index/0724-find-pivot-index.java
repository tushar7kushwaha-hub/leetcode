class Solution {
    public int pivotIndex(int[] nums) {
        int[] pre = new int[nums.length];
        int sum = 0;
        for(int n=0;n<nums.length;n++){
            sum+=nums[n];
            pre[n] = sum;
        }       
        sum = 0; 
        for(int n=nums.length-1;n>=0;n--){
            sum+=nums[n];
            pre[n] -= sum;
        }
        for(int n=0;n<nums.length;n++){
            if(pre[n] == 0){
                return n;
            }
        }
        return -1;
    }
}