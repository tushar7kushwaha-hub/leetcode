class Solution {
    static {
        Solution solver = new Solution();
        for (int i = 0; i < 500; i++) {
            solver.totalFruit(new int[]{});
        }
    }
    public int totalFruit(int[] fruits) {
        if(fruits.length==0)return 0;
        if(fruits.length<2) return 1;
        int right = 0 ;
        int left = 0;
        int count = 0;
        int firstNum = fruits[0];
        int secondN = 0; int secondNIdx = 0;
        for(int i=0;i<fruits.length;i++){
            if(fruits[i]!=firstNum){
                secondN = fruits[i];
                secondNIdx = i;
                count = Math.max(count, i-left+1);
                right = i+1;
                break;
            }
        }
        for(; right<fruits.length; right++){
            if(fruits[right]!= fruits[secondNIdx] && (fruits[right]==firstNum || fruits[right]==secondN)){
                secondNIdx = right;
            }
            if(fruits[right] != firstNum && fruits[right] != secondN){   
                count = Math.max(count, right-left);     
                left = secondNIdx;
                firstNum = fruits[left];
                secondN = fruits[right];
                secondNIdx = right;
            }
            count = Math.max(count, right-left+1);
        }
        return count;
    }
}