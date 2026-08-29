class Solution {
    public int reverse(int x) {
       int rev=0;
       while(x!=0){
        int tmp = x%10;
        rev = (rev*10)+tmp;
        x /= 10;
       }
       return rev;
    }
}