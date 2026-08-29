class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        String[] ss = s.trim().split("");
        for(int i = ss.length-1 ; i>=0 ; i--){
            if(ss[i].equals(" ")){
                break;
            }
            count++;
        }
        return count;
    }
}