import java.util.*;
class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums.length<2){
            if(nums[0] != k) return 0;
            else return k;
        } 
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum = 0;
        int count = 0;
        for(int n : nums){
            sum+=n;
            int diff = sum -k;
            if(map.containsKey(diff)){
                count+=map.get(diff);
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return count;
        
    }
}