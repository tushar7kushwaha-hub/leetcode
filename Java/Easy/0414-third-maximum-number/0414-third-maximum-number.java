class Solution {
    public int thirdMax(int[] nums) {
        long f = Long.MIN_VALUE;
        long s = Long.MIN_VALUE;
        long t = Long.MIN_VALUE;
        for(int i : nums){
            if(i == f || i == s || i == t){
                continue;
            }
             if (i > f) {
                t = s;
                s = f;
                f = i;
            } else if (i > s) {
                t = s;
                s = i;
            } else if (i > t) {
                t = i;
            }
        }
        return (int) (t == Long.MIN_VALUE ? f : t);
    }
}