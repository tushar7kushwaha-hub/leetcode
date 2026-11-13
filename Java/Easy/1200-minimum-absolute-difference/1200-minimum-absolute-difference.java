import java.util.*;
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int minDiff=Integer.MAX_VALUE;
        for(int i = 1; i < arr.length; i++){
            minDiff=Math.min(minDiff, Math.abs(arr[i]-arr[i-1]));
        }
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 1; i < arr.length; i++){
            if(Math.abs(arr[i-1]-arr[i]) == minDiff){
                list.add(Arrays.asList(arr[i-1], arr[i]));
            }
            
        }
        return list;
    }
}