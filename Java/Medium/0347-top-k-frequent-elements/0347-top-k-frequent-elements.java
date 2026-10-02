import java.util.*;
class Solution {
    public int[] topKFrequent(int[] nums, int k) { 
        if(nums.length==1){
            return nums;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }

        List<Integer>[] bucket = new List[nums.length + 1];
        for (int num : map.keySet()) {
            int freq = map.get(num);
            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(num);
        }

         int[] ans = new int[k];
        int counter = 0;
        
        for (int i = bucket.length - 1; i >= 0 && counter < k; i--) {
            if (bucket[i] != null) {
                for (int l : bucket[i]) {
                    ans[counter++] = l;
                    if (counter == k) {
                        return ans;
                    }
                }
            }
        }
        return ans;
    }
}