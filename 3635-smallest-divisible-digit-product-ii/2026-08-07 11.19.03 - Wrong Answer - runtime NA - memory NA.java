class Solution {
    public String smallestNumber(String num, long t) {
        int number = Integer.parseInt(num);
        
        int count = 1;
        int tt = (int)t*10;
        while(count<=tt){
            int product = 1;
            int n = number;
            while(n!=0){
                int rem = n%10;
                if(rem == 0){
                    n++;
                    continue;
                }
                product = product * rem;
                n/=10;
            }
            if(product % t == 0){
                String N = Integer.toString(number);
                return N;
            }
            number++;
            count++;
        }
        return "-1";
    }
}