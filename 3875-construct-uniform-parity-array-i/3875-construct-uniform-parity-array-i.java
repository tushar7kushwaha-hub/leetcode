class Solution {
    public boolean uniformArray(int[] nums1) {
        int[] nums2 = new int[nums1.length]; int idx = 0;
        int oddCount = 0;
        int evenCount = 0;
        for(int i : nums1){
            if(i%2==0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        if(evenCount>=oddCount){
        int firstOdd = 0;
        int flag = 0;
            for(int i = 0; i<nums1.length; i++){
                if(nums1[i]%2==0){
                    nums2[idx++] = nums1[i];
                }
                else if(nums1[i]%2!=0 && flag == 0){
                    firstOdd = nums1[i];
                    flag = 1;
                    nums2[idx++] = nums1[i] - firstOdd;
                    break;
                }
                if(nums1[i]%2!=0){
                    nums2[idx++] = nums1[i] - firstOdd;
                }
            }
        }else{
        int oddFirst = 1;
            for(int i = 0; i<nums1.length; i++){
                if(nums1[i]%2!=0){
                    oddFirst = nums1[i];
                    nums2[idx++] = nums1[i];
                }else if(nums1[i]%2==0){
                    nums2[idx++] = nums1[i] - oddFirst;
                }
            }
        }
        int checkEven = 0;
        int checkodd = 0;
        for(int i : nums2){
            if(i%2==0){
                checkEven++;
            }else{
                checkodd++;
            }
        }
        if(checkEven == nums2.length || checkodd == nums2.length){
            return true;
        }else return false;
    }
}