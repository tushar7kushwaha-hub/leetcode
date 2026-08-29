class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        if(nums.length==2){
            return (nums[0]-1)*(nums[1]-1);
        }
        
        int l1 = 0;
        int l2 = 0;

        for(int i = 1; i < n; i++){
            if(nums[l1] < nums[i]){
                l1 = i;
            }
        }
        for(int j = 1; j < n; j++){
            if(nums[l2] < nums[j]){
                if(nums[j] <= nums[l1]&& j != l1){
                    l2 = j;               
                }
            }
        }
        return (nums[l1]-1)*(nums[l2]-1);
    }
}