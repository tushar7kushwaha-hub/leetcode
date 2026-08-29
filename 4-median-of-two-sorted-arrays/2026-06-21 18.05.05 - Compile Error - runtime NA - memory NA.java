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
        int totalLength = n+m;
        if (totalLength % 2 == 0) {
            return (nums3[totalLength / 2 - 1] + nums3[totalLength / 2]) / 2.0;
        } else {
            return nums3[totalLength / 2];
        
    }
}