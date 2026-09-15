import java.util.*;
class Solution {
    public int[] sortedSquares(int[] nums) {
      int n = nums.length;
      int[] result = new int[n];
      int indx = n-1;
      int i = 0;
      int j = n-1;
      while(i<=j){
        int proi = nums[i]*nums[i];
        int proj = nums[j]*nums[j];
        if(proj>proi){
            result[indx]=proj;
            j--;
        }else{
            result[indx]=proi;
            i++;
        }
        indx--;
      }
        return result;
    }
}