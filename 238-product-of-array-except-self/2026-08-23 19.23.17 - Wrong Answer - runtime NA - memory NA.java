class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer  = new int[nums.length];
        int product = 1;
        int foundZero = 0;
        for(int num : nums){
            if(num == 0){
                foundZero++;
            }else{
                product*=num;
            }
        }
        for(int i = 0; i<nums.length; i++){
            if(nums[i]==0){
                answer[i] = product;
            }else{
                if(foundZero != 0){
                    answer[i] = (product/nums[i])*0;
                }else if(foundZero == 0){
                    answer[i] = (product/nums[i]);
                }
            }
        }
    return answer;

    }
}