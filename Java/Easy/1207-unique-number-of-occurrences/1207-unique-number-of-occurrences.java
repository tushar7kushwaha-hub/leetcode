import java.util.*;
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Set<Integer> set = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            set.add(e.getValue());
        }
        if(set.size()==map.size()){
            return true;
        }
        return false;
    }
}