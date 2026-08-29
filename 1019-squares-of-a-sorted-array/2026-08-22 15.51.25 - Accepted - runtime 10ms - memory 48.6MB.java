import java.util.*;
class Solution {
    public int[] sortedSquares(int[] nums) {
      int n = nums.length;
      int[] result = new int[n];
      int indx = 0;
      for(int i = 0; i<n; i++){
        if(nums[i]<0){
            int pro = nums[i]*nums[i];
            result[indx++] = Math.abs(pro);
        }else{
            int product = nums[i]* nums[i];
            result[indx++] = product;
        }
      }
      Arrays.sort(result);
      return result;

    }
}