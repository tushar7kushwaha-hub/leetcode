import java.util.HashMap;
import java.util.Map;
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())return false;
        int[] mapS1 = new int[26];
        for(char c : s1.toCharArray()){
            mapS1[c-'a']++;
        }
        int[] mapS2 = new int[26];
        int left = 0;
        for(int right=0; right<s2.length();right++){
            char ch1 = s2.charAt(right);
            mapS2[ch1-'a']++;
            if(right-left+1>s1.length()){
                char ch2 = s2.charAt(left);
                mapS2[ch2-'a']--;
                left++;
            }
            if(Arrays.equals(mapS1, mapS2)){
                return true;
            }
        }
        return false;
    }

}