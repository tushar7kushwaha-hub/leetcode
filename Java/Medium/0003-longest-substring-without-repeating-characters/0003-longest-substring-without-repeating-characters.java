import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] arr = new int[128];
        int left = 0;
        int res = 0;
        int right = 0;
        for(; right < s.length(); right++){
            int key = s.charAt(right);
            left = Math.max(left, arr[key]);
            res = Math.max(res, right-left+1);
            arr[key] =right+1;
        }
        return res;
    }
}