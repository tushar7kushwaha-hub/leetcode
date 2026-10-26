import java.util.Map;
import java.util.HashMap;

class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum = 0;
        int count = 0;
        for(int n : nums){
            sum+=n;
            int diff = sum -goal;
            if(map.containsKey(diff)){
                count+=map.get(diff);
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return count;
    }
}