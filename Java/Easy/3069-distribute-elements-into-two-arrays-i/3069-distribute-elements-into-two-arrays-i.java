import java.util.*;
class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr1.add(nums[0]);
        arr2.add(nums[1]);
        int A1 = 1;
        int A2 = 1;
        
        for(int i = 2; i<nums.length; i++){
            if(arr1.get(A1-1) > arr2.get(A2-1)){
                arr1.add(nums[i]);
                A1++;
            }else{
                arr2.add(nums[i]);
                A2++;
            }
        }
        int[] result = new int[arr1.size()+arr2.size()];
        int ind = 0;
        for(int i : arr1){
            result[ind++] = i;
        }
        for(int i : arr2){
            result[ind++] = i;
        }
        return result;
    }
}