class Solution {
    public int compress(char[] chars) {
        int ind = 0;
        for(int i = 0; i<chars.length; i++){
            int count = 0;
            int j = i;
            while(j<chars.length && chars[i]==chars[j]){
                count++;
                j++;
            }
            if(count==1){
                chars[ind++] = chars[i];
            }else if(count > 1){
                chars[ind++] = chars[i];
                String str = String.valueOf(count);
                for(char cc : str.toCharArray()){
                    chars[ind++] = cc;
                }
            }
            i = j-1;
        }
        return ind;
    }
}