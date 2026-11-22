import java.util.ArrayDeque;
import java.util.Deque;
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
        int idx=0;
        Deque<Integer> stack=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                int prv = stack.pop();
                ans[prv]= i-prv;
            }
            stack.push(i);
        }
        return ans;
    }
}