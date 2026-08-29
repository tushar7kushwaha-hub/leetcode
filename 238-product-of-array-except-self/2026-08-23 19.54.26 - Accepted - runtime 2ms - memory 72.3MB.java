class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        int Product = 1;
        int zeroCount = 0;

        for (int num : nums) {
            if (num == 0) {
                zeroCount++;
            } else {
                Product *= num;
            }
        }

        for (int i = 0; i < n; i++) {
            if (zeroCount > 1) {
                answer[i] = 0;
            } else if (zeroCount == 1) {
                answer[i] = (nums[i] == 0) ? Product : 0;
            } else {
                answer[i] = Product / nums[i];
            }
        }

        return answer;
    }
}