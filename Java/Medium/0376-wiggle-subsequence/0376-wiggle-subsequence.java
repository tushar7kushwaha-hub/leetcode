class Solution {
    public int wiggleMaxLength(int[] nums) {
        int len = 0;
        int l = 0;
        int r = 1;
        boolean flagUpDown = true;
        boolean flag = true;
        while(r<nums.length){
            int diff = nums[r]-nums[r-1];
            // it will check whether is patter only at once then never - up down or down up
            if(flag && diff>0){
                flagUpDown = true;
                flag = false;
            }else if(flag && diff<0){
                flagUpDown = false;
                flag = false;
            }

            if(flagUpDown && diff > 0){
                len++;
                flagUpDown = false;
            }else if( !flagUpDown && diff<0){
               len++;
               flagUpDown = true;
            }else{
                r++;
                continue;
            }
            r++;
            // l=r-1;
        }
        return len+1;
    }
}