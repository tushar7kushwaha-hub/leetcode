import java.util.*;
class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int maxLen = 0;
        for(int i : nums){
            set.add(i);
        }
        for(int n : set){
            if(!set.contains(n-1)){
                int currentNum = n;
                int currentLen = 1;
                while(set.contains(currentNum+1)){
                    currentNum+=1;
                    currentLen+=1;
                }
                maxLen = Math.max(maxLen, currentLen);
            }
        }
        return maxLen;
    }
}