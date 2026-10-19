import java.util.*;
class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map1 = new HashMap<>();
        int max = 0;
        for(char c:s.toCharArray()){
            map1.put(c, map1.getOrDefault(c,0)+1);
            max=Math.max(max,map1.get(c));
        }
        Map<Integer,List<Character>> map2 = new HashMap<>();
        for(Character c : map1.keySet()){
            int freq = map1.get(c);
            List<Character> list = new ArrayList<>();
            if(!map2.containsKey(freq)){
                map2.put(freq,list);
            }
            int loop = freq;
            while(loop>=1){
                map2.get(freq).add(c);
                loop--;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = max; i>0; i--){
            if(map2.containsKey(i)){
                List<Character> l = map2.get(i);
                for(char j:l){
                    sb.append(j);
                }
            }
        }
        return sb.toString();
    }
}