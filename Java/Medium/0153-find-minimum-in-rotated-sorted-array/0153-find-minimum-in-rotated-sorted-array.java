class Solution {
    public int findMin(int[] nums) {
        int low = 0; 
        int high = nums.length-1;
        int minNum = Integer.MAX_VALUE;
        while(low<=high){
            int mid = low+(high-low)/2;
            minNum = Math.min(minNum, nums[mid]);
            // if(nums[low]<=nums[mid] && nums[mid]<=nums[high]){
            //     high=mid-1;
            // }else if(nums[low]>=nums[mid] && nums[mid]<=nums[high]){
            //     high=mid-1;
            // }else{
            //     low=mid+1;
            // }
            if(nums[low]<=nums[mid] && nums[high]<=nums[mid]){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return minNum;
    }
}