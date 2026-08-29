import java.util.*;
class Solution {
    public int missingNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
            if(nums[i]>max){
                max = nums[i];
            }
        }
        if(nums.length>max){
            return nums.length;
        }else{
            for(int i = 0; i < 10000; i++){
                if(!map.containsKey(i)){
                    return i;
                }
            }
        }
        return 0;
    }
}