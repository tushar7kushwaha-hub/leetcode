class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m  = nums2.length;
        int[] nums3 = new int[n+m];
        int j = 0, k = 0, num = 0;
        while(j<nums1.length && k<nums2.length){
            if(nums1[j]<nums2[k]){
                nums3[num++] = nums1[j++];
            }else{
                nums3[num++] = nums2[k++];
            }
        }
        while (j < n) {
            nums3[num++] = nums1[j++];
        }

        while (k < m) {
            nums3[num++] = nums2[k++];
        }
        double sum = 0;
        for(int nu : nums3){
            sum+=nu;
        }
        double mid = sum/(n+m);
        return mid;
    }
}