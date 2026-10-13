import java.util.*;
class Solution {
    public int removeDuplicates(int[] nums) {
        int slow = 1;
        int fast = 1;
        int count = 1;
        for(;fast<nums.length;fast++){
            if(nums[fast]==nums[fast-1]){
                count++;
            }else{
                count=1;
            }
            if(count<=2){
                nums[slow++] = nums[fast];
            }
        }
        return slow;
    }
}