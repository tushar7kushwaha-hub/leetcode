import java.util.*;
class Solution {
    public int scoreOfParentheses(String s) {
        int score = 0;
        Deque<Integer> d = new ArrayDeque<>();
        for(char c : s.toCharArray()){
            if(c==')'){
                score = d.pop()+Math.max(score*2,1);
            }else{
                d.push(score);
                score =0;
            }
        }
        return score;
    }
}