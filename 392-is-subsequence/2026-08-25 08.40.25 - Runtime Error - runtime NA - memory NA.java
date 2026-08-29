import java.util.*;
class Solution {
    public boolean isSubsequence(String s, String t) {
       int sp = 0;
       int tp = 0;
       while (tp<t.length()){
        if(s.charAt(sp) == t.charAt(tp)){
            sp++;
            tp++;
            if(sp == (s.length()-1)){
                return true;
            }
        }else{
            tp++;
        }
       }
       return false;
    }
}