class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int m = nums1.length;
       int n = nums2.length;
       int mn = m+n;
       double sum = 0;
       for(int num : nums1){
        sum+=num;
       }
       for(int num : nums2){
        sum+=num;
       }
        double N = sum/mn;
        return N;
       }
    }
