import java.util.*;
class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map1 = new HashMap<>();
        Set<Character> map2 = new HashSet<>();
        
        for(int i=0;i<s.length();i++){
            char cS = s.charAt(i);
            char cT = t.charAt(i);
            if(map1.containsKey(cS)){
                if(map1.get(cS)!=cT){
                    return false;
                }
            }else{
               if( map2.contains(cT)){
                    return false;
                }
                map1.put(cS,cT);
                map2.add(cT);
            }      
        }
        return true;
    }
}