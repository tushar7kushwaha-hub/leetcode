import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
       Map<Integer, Integer> map = new HashMap<>();
       for(int i : nums){
        map.put(i, map.getOrDefault(i, 0)+1);
       }
        int max = Integer.MIN_VALUE;
        int key = 0;
       for (Map.Entry<Integer, Integer> entry : map.entrySet()){
        int maxValue = entry.getValue();
        if(max<maxValue){
            max = maxValue;
            key = entry.getKey();
        }

       }
       return key;
    }
}