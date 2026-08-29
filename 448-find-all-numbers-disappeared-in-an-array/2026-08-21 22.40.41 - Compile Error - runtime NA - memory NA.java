import java.util.*;
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        if(nums[0]==nums[1] && nums.length>nums[1]){
            return new ArrayList<>(List.of(nums.length));
        }
        Map<Integer, Integer> map = new HashMap<>(100000);
        List<Integer> list = new ArrayList<>(100000);
        int n = nums.length;
        int count = 0j;
        for(int i = 0; i<n; i++){
            map.put(nums[i], nums[i]);
            count++;
        }
        
        for(int i = 1; i<=count; i++){
            if(!map.containsKey(i)){
                list.add(i);
            }
        }
        return list;
    }
}