import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();

        for(int n=0; n<nums.length; n++){
            if(nums[n]==target){
                list.add(n);
            }
        }
        if(list.size()!=0){
            return list;
        }
        return new ArrayList<>();
    }
}