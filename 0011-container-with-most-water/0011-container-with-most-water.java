class Solution {
    public int maxArea(int[] height) {
        int right = height.length-1;
        int left = 0;
        int containsWater = 0;
        while(left<right){
            containsWater = Math.max(containsWater,(Math.min(height[left],height[right])*(right-left)));
            if(height[left] > height[right]){
                right--;
            }else{
                left++;
            }
        }
        
        return containsWater;

    }
}