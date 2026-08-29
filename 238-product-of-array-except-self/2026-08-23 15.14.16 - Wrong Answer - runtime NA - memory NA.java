class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer  = new int[nums.length];
        int product = 1;
        int foundZero = 1;
        for(int num : nums){
            if(num == 0){
                foundZero = 0;
                continue;
            }
            product*=num;
        }
        for(int i = 0; i<nums.length; i++){
            if(nums[i]==0){
                answer[i] = product;
            }else{
            answer[i] = (product/nums[i])*foundZero;
            }
        }
    return answer;

    }
}