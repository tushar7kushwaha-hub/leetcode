import java.util.*;
class Solution {
    public static int runtest()
    {
        Solution solver = new Solution();
        for(int i=0;i<500;i++)
            solver.longestConsecutive(new int[]{});

        return 0;
    }
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
        System.gc();
        return maxLen;
    }
}