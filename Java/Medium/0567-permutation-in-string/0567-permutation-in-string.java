import java.util.HashMap;
import java.util.Map;
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())return false;
        Map<Character, Integer> mapS1 = new HashMap<>();
        for(char c : s1.toCharArray()){
            mapS1.put(c, mapS1.getOrDefault(c,0)+1);
        }
        Map<Character, Integer> mapS2 = new HashMap<>();
        int left = 0;
        for(int right=0; right<s2.length();right++){
            char ch1 = s2.charAt(right);
            mapS2.put(ch1, mapS2.getOrDefault(ch1, 0)+1);

            if(right-left+1>s1.length()){
                char ch2 = s2.charAt(left);
                if(mapS2.get(ch2)==1){
                    mapS2.remove(ch2);
                }else{
                    mapS2.put(ch2, mapS2.get(ch2)-1);
                }
                left++;
            }
            if(mapS2.equals(mapS1)){
                return true;
            }
        }
        return false;
    }
}