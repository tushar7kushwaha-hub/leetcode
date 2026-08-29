class Solution {
    public boolean backspaceCompare(String s, String t) {
        int n = s.length();
        int m = t.length();
        String newS = "";
        String newT = "";
        int count = 0;

        for(int i=n-1; i>=0; i--){
            if(s.charAt(i)=='#'){
                count++;
                // i--;
                continue;
            }else{
                i = (i - count);
                count = 0;
                if(i<0){
                    newS = newS +"";
                    continue;
                }
                newS = newS + s.charAt(i);
            }
        }
        
        return newS.equals(newT);
    }
}