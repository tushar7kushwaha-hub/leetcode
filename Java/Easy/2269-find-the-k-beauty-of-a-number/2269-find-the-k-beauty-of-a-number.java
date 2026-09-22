class Solution {
    public int divisorSubstrings(int num, int k) {
        int org = num;
        int org1 = num;
        int digitCount = 0;
        while(org!=0){
            digitCount++;
            org/=10;
        }
        int[] nums = new int[digitCount]; int idx = digitCount-1;
        while(num!=0){
            int rem = num%10;
            nums[idx--] = rem;
            num/=10;
        }
        if(org1 < 2 && k < 2){
            return nums[0];
        }else if(org1< 2 && k > 1){
            return 0;
        }
        int beautyCount = 0;
        int left = 0;
        int right = k-1;
        while(right<nums.length){
            int l = left;
            int r = right;
            int n = 0;
            while(l<=r){
                n*=10;
                n+=nums[l++];
            }
            if(n!=0 && org1%n==0){
                beautyCount++;
            }
            left++;
            right++;
        }
        return beautyCount;

    }
}