class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] alp = new int[26];
        for(int i = 0; i<s.length(); i++){
            char ch1 = s.charAt(i);
            int idx1 = (int) ch1 - 97;
            alp[idx1]++;
            ch1 = t.charAt(i);
            idx1 = (int) ch1 - 97;
            alp[idx1]--;
        }
        for(int i : alp){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
}