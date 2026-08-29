import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        char[] newS = new char[s.length()];
        char[] newt = new char[s.length()];
        for(int i=0;i<s.length();i++){
            newS[i]=s.charAt(i);
            newt[i]=t.charAt(i);
        }
        Arrays.sort(newS);
        Arrays.sort(newt);
        return Arrays.equals(newS,newt);
    }
}