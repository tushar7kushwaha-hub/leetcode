class Solution {
    public int[] plusOne(int[] digits) {
        int sum = 0;
        for(int digit : digits){
            sum = (sum * 10) + digit;
        }
        sum++;
        int[] toReturn = Integer.toString(sum).chars().map(c -> c - '0').toArray();
        return toReturn;
    }
}