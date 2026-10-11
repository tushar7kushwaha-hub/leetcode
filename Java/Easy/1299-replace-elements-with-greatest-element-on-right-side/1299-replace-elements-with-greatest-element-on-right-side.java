class Solution {
    public int[] replaceElements(int[] arr) {
        if(arr.length == 1) return new int[] {-1};
        
        int[] res = new int[arr.length];
        int great = -1;
        res[arr.length-1] = -1;
        for(int i = arr.length-2; i>=0; i--){
            great = Math.max(great, arr[i+1]);
            res[i] = great;
        }
        return res;
    }
}