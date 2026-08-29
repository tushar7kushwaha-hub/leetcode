import java.util.*;
class Solution {
    public boolean isSubsequence(String s, String t) {
       Map<Character, Integer> map = new HashMap<>();
       for(int i = 0; i < t.length(); i++){
        map.put(t.charAt(i), i);
       }
       int flag = s.length();
       for(int i = 0; i<s.length(); i++){
        if(map.containsKey(s.charAt(i))){
            flag--;
        }
       }
       if(flag==0){
        return true;
       }else{
        return false;
       }
    }
}