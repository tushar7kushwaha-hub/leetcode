import java.util.*;
class Solution {
    public boolean checkValidString(String s) {
        Deque<Integer> d = new ArrayDeque<>();
        Deque<Integer> stars = new ArrayDeque<>();
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c=='('){
                d.push(i);
            }else if(c==')'){
                if(d.isEmpty() && stars.isEmpty()) return false;
                if(!d.isEmpty()){
                    d.pop();
                }else{
                    stars.pop(); 
                }
            }else{
                stars.push(i);
            }
        }
        if(!d.isEmpty()&&stars.isEmpty()){
            return false;
        }
        while((d.size()>0 && stars.size() > 0)&&stars.peek()>d.peek()){
            d.pop();
            stars.pop();
        }
        return d.isEmpty();
    }
}