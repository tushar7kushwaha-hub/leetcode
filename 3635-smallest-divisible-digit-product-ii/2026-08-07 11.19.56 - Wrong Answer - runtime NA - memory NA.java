class Solution {
    public String smallestNumber(String num, long t) {
        int number = Integer.parseInt(num);
        
        long count = 1;
        long tt = t*10;
        while(count<=tt){
            long product = 1;
            long n = number;
            while(n!=0){
                long rem = n%10;
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