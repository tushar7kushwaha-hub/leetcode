class Solution {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length; i >=0; i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digit[i]=0;
        }
        int[] newar = new int[digits.length + 1];
        newar[0]= 1;
        return newar;
    }
}