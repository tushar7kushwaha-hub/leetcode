class Solution {
    public int minimumSwaps(int[] nums) {
        int swapCount = 0;
        int right = nums.length-1;
        int left = 0;
        while(left<right){
            while(nums[right]==0&&right>left) right--;
            while(nums[left]!=0&&left<right) left++;
            if(nums[left]==0 && left<right){
                int tmp = nums[left];
                nums[left] = nums[right];
                nums[right] = tmp;
                swapCount++; 
                left++;
                right--;
            }
        }
        return swapCount;
    }
}