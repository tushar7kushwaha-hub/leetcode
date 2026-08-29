class Solution {
    public int reverse(int x) {
       long rev = 0;
       while(x!=0){
        int tmp = x%10;
        rev = (long) (rev*10)+tmp;
        x /= 10;
       }
       if(rev >= -2147483648 || rev < 2147483647){
        return (long) rev;
       }
       return 0;
    }
}