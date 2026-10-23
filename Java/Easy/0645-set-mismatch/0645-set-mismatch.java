class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        for(int i : nums){
            arr[i-1]++;
        }
        int dup = 0;
        int mis = 0;
        for(int i=0; i<n; i++){
            if(arr[i]==0){
                mis = i+1;
            }
            else if(arr[i] == 2){
                dup = i+1;
            }
        }
        int[] ans = new int[2];
        ans[0] = dup;
        ans[1] = mis;
        return ans;
    }
}