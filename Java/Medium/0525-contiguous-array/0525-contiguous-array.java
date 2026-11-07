import java.util.*;
class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int preSum = 0;
        int len = 0;
        for(int i=0; i<nums.length; i++){
            int num =nums[i];
            if(num==1){
                preSum++;
            }else{
                preSum--;
            }
            if (map.containsKey(preSum)) {
                len = Math.max(len, i - map.get(preSum));
            } else {
                map.put(preSum, i);
            }
        }   
        return len;
    }
}                     