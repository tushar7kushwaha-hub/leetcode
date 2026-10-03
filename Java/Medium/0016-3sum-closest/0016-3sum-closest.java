import java.util.Arrays;
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if(nums.length==3) return nums[0]+nums[1]+nums[2];
        Arrays.sort(nums);
        int closestSum = Integer.MAX_VALUE;
        for(int i = 0 ; i< nums.length-2; i++){
            int low = i+1;
            int right =nums.length-1;
            while(low < right){
                int sum = nums[i]+nums[low]+nums[right];
                if (sum == target){
                    return sum;
                }
                if(Math.abs(sum - target) < Math.abs(closestSum - target)){
                    closestSum = sum;
                }
                if(sum>target){
                    right--;
                }else{
                    low++;
                }
            }
        }   
        return closestSum;     
    }
}