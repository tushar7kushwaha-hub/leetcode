import java.util.*;
class Solution {
    public int[] sortedSquares(int[] nums) {
      int n = nums.length;
      int[] result = new int[n];
      int indx = 0;
      for(int i = 0; i<n; i++){
        int product = nums[i]* nums[i];
        result[indx++] = product;
      }
      Arrays.sort(result);
      return result;

    }
}