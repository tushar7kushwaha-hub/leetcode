import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> N = new HashSet<>();
        for(int n : nums){
            if(N.contains(n)){
                return true;
            }
            N.add(n);
        }
        return false;
    }
}