class Solution {
    public String smallestNumber(String num, long t) {
        int number = Integer.parseInt(num);
        if(number<t){
            String Tstr = Long.toString(t);
            return Tstr;
        }
        int count = 1;
        while(count<=t){
            int product = 1;
            int n = number;
            while(n!=0){
                int rem = n%10;
                if(rem == 0){
                    number++;
                    continue;
                }
                product *= rem;
                n/=10;
            }
            if(product % t == 0){
                String N = Integer.toString(number);
                return N;
            }else{
                ++number;
            }
            count++;
        }
        return "-1";
    }
}