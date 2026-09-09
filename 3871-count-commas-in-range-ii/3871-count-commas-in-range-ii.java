class Solution {
    public long countCommas(long n) {
        if(n<1000){
            return 0;
        }
        long count = 0;
        long base = 1000;
        while(n>=base){
            count += (n-base+1);
            base*=1000;
        }

        return count;
    }
}
