class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        if(k>arr.length){
            return 0;
        }
        int sumCount = 0;
        int currSum = 0;
        for(int i = 0; i<k; i++){
            currSum+=arr[i];
        }
        if((currSum/k) >= threshold){
            sumCount++;
        }
        int left = 1;
        int right = k;
        while(right<arr.length){
            currSum+=arr[right];
            currSum-=arr[left-1];
            if((currSum/k) >= threshold){
                sumCount++;
            }
            right++;
            left++;
        }
        return sumCount;
    }
}