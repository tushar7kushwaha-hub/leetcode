class Solution {
    public int maxArea(int[] height) {
        int right = height.length-1;
        int left = 0;
        int containsWater = 0;
        while(left<right){
            int len = right-left;
            int multiplier = Math.min(height[left], height[right]);
            int current_water = multiplier*len;
            containsWater = Math.max(containsWater, current_water);
            if(height[left] > height[right]){
                right--;
            }else{
                left++;
            }
        }
        
        return containsWater;

    }
}