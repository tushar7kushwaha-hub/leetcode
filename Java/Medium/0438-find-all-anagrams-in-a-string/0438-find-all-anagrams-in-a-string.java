import java.util.*;
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if (s == null || p == null || s.length() < p.length()) {
            return list;
        }
        Map<Character, Integer> pMap = new HashMap<>();
        for(char c : p.toCharArray()){
            pMap.put(c, pMap.getOrDefault(c,0)+1);
        }
        Map<Character, Integer> sMap = new HashMap<>();
        int left = 0;
        for(int right = 0; right<s.length(); right++){
            char ch = s.charAt(right);
            sMap.put(ch, sMap.getOrDefault(ch, 0)+1);

            if(right-left+1>p.length()){
                char leftCh = s.charAt(left);
                if(sMap.get(leftCh)==1){
                    sMap.remove(leftCh);
                }else{
                    sMap.put(leftCh, sMap.get(leftCh)-1);
                }
                left++;
            }
            if(sMap.equals(pMap)){
                list.add(left);
            }
        }
        return list;
    }
}