import java.util.ArrayDeque;
import java.util.Deque;
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] arr = new int[n];
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i = 0 ; i < n ; i++){
            while(!dq.isEmpty()&&temperatures[i]>temperatures[dq.peek()]){
                int prev = dq.pop();
                arr[prev] = i - prev;
            }
            dq.push(i);
        }
        return arr;
    }
}