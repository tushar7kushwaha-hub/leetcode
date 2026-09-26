import java.util.*;
class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String, String> map = new HashMap<>();
        for(List<String> l : knowledge){
            if(!l.isEmpty()){
                map.put(l.get(0), l.get(1));
            }
        }
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                StringBuilder find = new StringBuilder();
                while(i<s.length() && s.charAt(i)!=')'){
                    i++;
                    if(s.charAt(i)!=')')
                    find.append(s.charAt(i));
                }
                String key = find.toString();
                if(map.containsKey(key)){
                    ans.append(map.get(key));
                }else{
                    ans.append("?");
                }
            }else{
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
}