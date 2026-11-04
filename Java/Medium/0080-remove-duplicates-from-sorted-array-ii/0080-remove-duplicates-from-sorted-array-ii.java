class Solution {
    public int removeDuplicates(int[] nums) {
        int l=1;
        int r=1;
        int c=1;
        for(;r<nums.length;r++){
            if(nums[r]==nums[r-1]){
                c++;
            }else{
                c=1;
            }
            if(c<=2){
                nums[l++]=nums[r];
            }
        }
        return l;
    }
}