class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int org = x;
        long rev = 0;
        while(x!=0){
            int temp = x%10;
            rev = (rev * 10) + temp;
            x/=10; 
        }
        if(org == (int) rev){
            return true;
        }
        return false;

    }
}