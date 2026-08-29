import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> N = new HashSet<>();
        for(int num : nums){
            N.add(num);
        }
        if(N.size()<nums.length){
            return true;
        }
        return false;
    }
}