class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low = 0;
        int high = arr.length-1;
        int res = 0;
        while(low<high){
            int mid = low + (high-low)/2;
            int right = mid+1;
            int left = mid;
            if((arr[right]-arr[left]) > 0){
                low = right;
                if(arr[right] > arr[res]){
                    res = right;
                }
            }else{
                high = left;
                if(arr[left] > arr[res]){
                    res = left;
                }
            }
            
        }
        return res;
    }
}