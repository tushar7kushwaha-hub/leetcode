class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer  = new int[nums.length];
        if(nums.length == 2){
            answer[0]=nums[1];
            answer[1]=nums[0];
            return answer;
        }
        int n = nums.length;
        int product = 1;
        int foundZero = 0;
        for(int num : nums){
            if(num == 0){
                foundZero++;//2
            }else{
                product*=num;//4
            }
            if(foundZero == n){
                product = 0;
            }
        }
        for(int i = 0; i<nums.length; i++){
            if(nums[i]!=0){
                if(foundZero == 0){
                    answer[i] = (product/nums[i]);
                }else{
                    answer[i] = 0;
                }
            }else{
                    answer[i] = product;
            }
        }
    return answer;

    }
}