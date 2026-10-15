class Solution {
    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<chars.length; i++){
            int count = 0;
            int j = i;
            while(j<chars.length && chars[i]==chars[j]){
                count++;
                j++;
            }
            if(count==1){
                sb.append(chars[i]);
            }else if(count > 1){
                sb.append(chars[i]);
                sb.append(count);
            }
            i = j-1;
        }
        int idx = 0;
        for(char ch : sb.toString().toCharArray()){
            chars[idx++] = ch;
        }
        return idx;
    }
}