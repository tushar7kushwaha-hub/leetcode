class Solution {
    public int maximumProduct(int[] nums) {
        int pro1 = 1;
        int n = nums.length;
        if(n <= 3){
            for(int N : nums){
                pro1 *= N;
            }
            return pro1;
        }

        for(int i = 0; i < n - 1; i++){
            if(nums[i]>nums[i+1]){
                int temp = nums[i];
                nums[i] = nums[i+1];
                nums[i+1]=temp;
            }
        }
        int pro2 = 1;
        for(int i = n -1; i>=n -4; i--){
            pro2 *= nums[i];
        }
        return pro2;
    }
}