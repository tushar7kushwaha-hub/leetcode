import java.util.*;
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int n : nums){
            int idx = Math.abs(n) -1;
            if(nums[idx]<0){
                list.add(Math.abs(n));
            }else{
                nums[idx] = -nums[idx];
            }
        }
        
        
        return list;
    }
}