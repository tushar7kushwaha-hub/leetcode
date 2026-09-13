class Solution {
    public int climbStairs(int n) {
        if(n<=2) return n;
        int prv1 = 1;
        int prv2 = 2;
        for(int i = 3; i<=n; i++){
            int cu = prv1+prv2;
            prv1= prv2;
            prv2 = cu;
        }
        return prv2;
    }
}