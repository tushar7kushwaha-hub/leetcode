import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()<2 ) return s.length();
        Map<Character, Integer> map = new HashMap<>();
        int res = 0;
        int left = 0;
        for(int right = 0; right<s.length(); right++){
            char key = s.charAt(right);
            if(map.containsKey(key)){
                left = Math.max(left, map.get(key)+1);
            }
            map.put(key,right);
            res = Math.max(res, right - left + 1);
        }
        return res;
    }
}