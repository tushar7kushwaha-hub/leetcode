import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        char[] newS = s.toCharArray();
        char[] newt = t.toCharArray();
        Arrays.sort(newS);
        Arrays.sort(newt);
        return Arrays.equals(newS,newt);
    }
}