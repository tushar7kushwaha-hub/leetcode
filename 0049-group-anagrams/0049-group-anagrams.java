import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String, List<String> > map = new HashMap<>();

       for(String i : strs){
        char[] ch = i.toCharArray();
        Arrays.sort(ch);
        String s = new String(ch);
        if (!map.containsKey(s)) {
            map.put(s, new ArrayList<>());
        }
        map.get(s).add(i); 
       }
       List<List<String>> list = new ArrayList<>();
       for(Map.Entry<String, List<String>> e : map.entrySet()){
            list.add(e.getValue());
       }
       return list;
    }
}