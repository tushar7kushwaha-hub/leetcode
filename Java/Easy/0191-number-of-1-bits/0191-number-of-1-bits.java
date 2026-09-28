class Solution {
    public int hammingWeight(int n) {
        int count = 0;
       String s =  Integer.toBinaryString(n);
       for(char c: s.toCharArray()){
        if(c!='0'){
            count++;
        }
       }
       return count;
    }
}