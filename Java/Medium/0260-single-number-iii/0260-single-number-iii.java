import java.util.*;
class Solution {
    public int[] singleNumber(int[] nums) {
        int[] ans = new int[2]; int idx = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            if(e.getValue()==1){
                ans[idx++] = e.getKey();
            }
        }
        return ans;
    }
}