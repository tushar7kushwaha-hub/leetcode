import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList<>();
        int i = num.length-1;
        while(i>=0||k>0){
            if(i>=0){
                k+=num[i];
                i--;
            }
            int rem = k % 10;
            list.add(rem);
            k/=10;
        }
        Collections.reverse(list);
        return list;
    }
}