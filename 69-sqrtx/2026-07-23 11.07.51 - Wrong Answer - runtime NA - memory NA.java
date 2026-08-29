class Solution {
    public int mySqrt(int x) {
        if(x<2) return x;
        if(x<4) return 1;
        int left= 0; 
        int right = x;
        int mid = 0;
        while(left<=right){
            mid = (left+right)/2;
            if((mid*mid) == x){
                return mid;
            }
            if((mid*mid)<x){
                left = mid +1;
            }
            if((mid*mid)>x){
                right = mid-1;
            }
        }
        return mid-1;
    }
}