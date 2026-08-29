class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double maxAvg = Integer.MIN_VALUE;
        double sum = 0;
        int left = 0;
        int right = k-1;
        while(right<n){
            if(left==0){
            for(int i = left; i<=right; i++)
                sum += nums[i];
            }else{
                sum = sum +nums[right];
            }
            double avg = sum/k;
            if(maxAvg<avg)
            maxAvg = avg;
            sum = sum - nums[left];
            left++;
            right++;
        }
        return maxAvg;
    }
}