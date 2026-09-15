class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int mn = m+n;
        int[] merged = new int[m+n];
        int i = 0; 
        int j = 0; 
        int k = 0; 
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                merged[k] = nums1[i];
                i++;
            } else {
                merged[k] = nums2[j];
                j++;
            }
            k++;
        }
        while (i < m) {
            merged[k] =nums1[i];
            i++;
            k++;
        }
        while (j < n) {
            merged[k] = nums2[j];
            j++;
            k++;
        }
        double N = 0;
        if(mn%2 != 0){
            mn = (mn / 2);
            N = merged[mn];
        }else{
            mn = (mn/2);
            N = (double) (merged[mn] + merged[mn-1])/2;
        }
        return N;
    }
}
