import java.util.Deque;
import java.util.ArrayDeque;
class Solution {
    public boolean isValid(String s) {
        Deque<String> stack = new ArrayDeque<>();
       String[] str = s.split("");
       for(int i=0; i<str.length; i++){
        String ch = str[i];
        if(ch.equals("(") || ch.equals("[")|| ch.equals("{")){
            stack.push(ch);
        }else{
            if(ch.equals(")")||ch.equals("]")||ch.equals("}")){
                if(stack.isEmpty()){
                    return false;
                }
                String top = stack.pop();
                if(ch.equals(")") && !top.equals("(")) return false;
                if(ch.equals("}") && !top.equals("{")) return false;
                if(ch.equals("]") && !top.equals("[")) return false;
            }
        }
       }
       return stack.isEmpty();
    }
}