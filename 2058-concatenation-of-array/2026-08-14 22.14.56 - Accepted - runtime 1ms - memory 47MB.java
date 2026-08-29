class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];
        int j = 0;
        int l = 1;
        while(l<=2){
        for(int i = 0; i < nums.length; i++){
            ans[j++] = nums[i];
        }
        l++;
        }
        return ans;
    }
}