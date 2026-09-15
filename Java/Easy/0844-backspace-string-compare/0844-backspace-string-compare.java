class Solution {
    public boolean backspaceCompare(String s, String t) {
      return method(s).equals(method(t));
    }
    private String method(String str){
        StringBuilder stack = new StringBuilder();
        for(char c : str.toCharArray()){
            if(c != '#'){
                stack.append(c);
            }else if(stack.length()>0){
                stack.deleteCharAt(stack.length()-1);
            }
        }
        return stack.toString();
    }
}