import java.util.*;
class Solution {
    public boolean lemonadeChange(int[] bills) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int bill : bills){
            if(bill == 5){
                map.put(bill, map.getOrDefault(bill,0)+1);
            }else if(bill == 10){
                if(map.containsKey(5) && map.get(5)>0){
                    map.put(5, map.get(5)-1);
                    map.put(bill, map.getOrDefault(bill,0)+1);
                }else{
                    return false;
                }
            }else{
                if(map.containsKey(10) && map.get(10)>0 && map.containsKey(5) && map.get(5)>0){
                    map.put(10, map.get(10)-1);
                    map.put(5, map.get(5)-1);
                }else if(map.containsKey(5) && map.get(5)>=3){
                    map.put(5, map.get(5)-3);
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}