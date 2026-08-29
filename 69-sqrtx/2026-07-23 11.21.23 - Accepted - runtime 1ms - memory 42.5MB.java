class Solution {
    public int mySqrt(int x) {
        if(x<2) return x;
        if(x<4) return 1;
        int left= 1; 
        int right = x/2;
        int as = 0;
        while(left<=right){
            int mid = left+(right-left)/2;
            if (mid <= x / mid) {
                as = mid;      
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return as;
    }
}