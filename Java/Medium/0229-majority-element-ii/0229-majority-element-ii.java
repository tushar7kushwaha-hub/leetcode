import java.util.*;
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        List<Integer> list = new ArrayList<>();
        int visibility = nums.length/3;
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            if(e.getValue()> visibility){
                list.add(e.getKey());
            }
        }
        return list;
    }
}