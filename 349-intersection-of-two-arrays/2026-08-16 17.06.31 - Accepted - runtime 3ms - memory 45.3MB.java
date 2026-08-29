import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> n1 = new HashSet<Integer>();
        for(int n : nums1){
           n1.add(n);
        }
        Set<Integer> n2 = new HashSet<Integer>();
        for(int n : nums2){
           n2.add(n);
        }
        n1.retainAll(n2);
        int len = n1.size();
        int[] n3 = new int[len];
        int i = 0;
        for(int n : n1){
            n3[i++] = n;
        }
        return n3;

    }
}