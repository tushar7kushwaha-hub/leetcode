class Solution {
    public int lengthOfLastWord(String s) {
        String[] str = s.trim().split("\\s+");
        
        String lastword = "";
        for(String word : str){
            lastword  = word;
        }
        return lastword.length();
    }
}