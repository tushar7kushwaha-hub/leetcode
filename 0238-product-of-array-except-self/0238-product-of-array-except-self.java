class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;int[] answer = new int[n];
        int proP = 1;
        int proS = 1;

        for(int i = 0; i<n; i++){
            answer[i] = proP;
            proP*= nums[i]; 
        }
        for(int i = n-1; i>=0;i--){
            answer[i]*=proS;
            proS*=nums[i];
        } 
        return answer;
    }
}