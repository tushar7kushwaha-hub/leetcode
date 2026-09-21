class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] ans = new int[code.length];
        if(k == 0){
            return ans;

        }else if(k>0){
            for(int i=0;i<code.length;i++){
                int left = 1;
                int sum = 0;
                int point = i+1;
                while(left<=k){
                    if(point>=code.length){
                        point = 0;
                    }
                    sum+=code[point++];
                    left++;
                }
                ans[i] = sum;
            }
            return ans;
            
        }else{
            for(int i=code.length-1; i>=0; i--){
                int left = 1;
                int right = Math.abs(k);
                int sum = 0;
                int point = i-1;
                while(left<=right){
                    if(point<0){
                        point = code.length-1;
                    }
                    sum+=code[point--];
                    left++;
                }
                ans[i] = sum;
            }
            return ans;
        }
    }
}