class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left = 0;
        int right = k-1;
        double sum = 0;
        double maxAvg = Integer.MIN_VALUE;
        for(int i = 0; i<k; i++){
            sum+= nums[i];
        }
        maxAvg = Math.max(maxAvg, (sum/k));
        while(right<nums.length-1){
            sum-= nums[left++];
            right++;
            sum+=nums[right];
            maxAvg = Math.max(maxAvg, (sum/k));
        }
        return maxAvg;
    }
}