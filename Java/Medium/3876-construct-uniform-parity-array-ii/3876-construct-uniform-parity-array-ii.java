class Solution {
    public boolean uniformArray(int[] nums1) {
        int countOdd = 0; int countEven = 0;
        int minOdd = Integer.MAX_VALUE;
        int minEven = Integer.MAX_VALUE;
        int n = nums1.length;

        for(int i : nums1){
            if(i%2==0){
                minEven = Math.min(minEven, i);
                countEven++;
            }else{
                minOdd = Math.min(minOdd, i);
                countOdd++;
            }
        }
        if(countOdd == n || countEven == n){return true;}
        if(minOdd<minEven){return true;}
        else{return false;}

    }
}