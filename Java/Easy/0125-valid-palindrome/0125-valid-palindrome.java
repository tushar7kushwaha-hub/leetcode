class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() < 2) return true;
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                if(Character.isLetterOrDigit(c)){
                char ch = Character.toLowerCase(c);
                sb.append(ch);
            }
            }
        }
        return sb.toString().equals(sb.reverse().toString());
    }
}