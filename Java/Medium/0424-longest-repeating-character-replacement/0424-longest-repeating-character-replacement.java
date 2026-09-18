import java.util.*;
class Solution {
    public int characterReplacement(String s, int k) {
        char[] str = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        int left = 0; int right = 0;
        int maxLen = 0;
        int maxFreq = 0;
        while(right<str.length){
            map.put(str[right], map.getOrDefault(str[right], 0)+1);
            maxFreq = Math.max(maxFreq, map.get(str[right]));

            if((right-left+1)- maxFreq > k){
                map.put(str[left], map.getOrDefault(str[left], 0)-1);
                left++;
            }
            maxLen = Math.max(maxLen, right-left+1);
            right++;
        }
        return maxLen;
    }
}