import java.util.*;
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        if(s.length<1){return 0;}
        Arrays.sort(g);
        Arrays.sort(s);
        int gLen = g.length-1;
        int sLen = s.length-1;
        int count = 0;
        while(gLen>=0 && sLen>=0){
            if(s[sLen] >= g[gLen]){
                count++;
                gLen--;
                sLen--;
            }else{
                gLen--;
            }
        }
        return count;
    }
}