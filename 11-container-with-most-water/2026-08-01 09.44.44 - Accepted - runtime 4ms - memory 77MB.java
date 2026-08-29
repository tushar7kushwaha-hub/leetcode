class Solution {
    public int maxArea(int[] height) {
        int right = height.length-1;
        int left = 0;
        int area = 0;
        while(left<right){
            int cur_area = (height[left] < height[right] ? height[left] : height[right])*(right-left);
            if(cur_area>area){
                area = cur_area;
            }
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return area;

    }
}