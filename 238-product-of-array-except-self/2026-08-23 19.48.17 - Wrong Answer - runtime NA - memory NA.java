class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer  = new int[n];
        if(n==2){
            answer[0]=nums[1];
            answer[1]=nums[0];
            return answer;
        }
        int product = 1; int productFlag = 0;
        int foundZero = 0;
        for(int num : nums){
            if(num == 0){
                foundZero++;//2
            }else{
                product*=num;//6
                productFlag++;
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
                if(productFlag>foundZero){
                    answer[i] = product;
                }else
                    answer[i] = 0;
            }
        }
    return answer;

    }
}