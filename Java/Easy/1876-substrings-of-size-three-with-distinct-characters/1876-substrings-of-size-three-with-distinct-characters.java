import java.util.*;
class Solution {
    public int countGoodSubstrings(String s) {
        if(s.length()<3) return 0;
        HashSet<Character> set = new HashSet<>();
        char[] ch = s.toCharArray();
        int left = 0; int right = 2;
        int count = 0;
        while(right<ch.length){
            int i = left;
            while(right<ch.length && i<=right){
                set.add(ch[i]);
                i++;
            }
            if(set.size() == 3){
                count++;
            }
            set.clear();
            right++;
            left++;
        }
        return count;
    }
}