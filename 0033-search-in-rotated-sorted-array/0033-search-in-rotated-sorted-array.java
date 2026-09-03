class Solution {
    public int search(int[] nums, int target) {
        if(nums.length<2){
            if(nums[0]==target){
                return 0;
            }else{
                return -1;
            }
        }
        int low = 0;
        int high = nums.length-1;
        while(low<high){
            int mid = low+(high-low)/2;
            if(nums[high]==target) return high;
            if(nums[low]==target) return low;
            if(nums[mid]==target){
                return mid;
            }else if(nums[low]<=target){
                high = mid-1;
            }else{
                low = mid+1;
            }

        }
        return -1;
        
    }
}