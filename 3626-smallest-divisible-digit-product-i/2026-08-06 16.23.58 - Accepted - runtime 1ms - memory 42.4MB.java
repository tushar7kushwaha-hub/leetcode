class Solution {
    public int smallestNumber(int n, int t) {
        // if(n<10){
        //     if(n%t==0){
        //         return n;
        //     }else{
        //         return t;
        //     }
        // }
        int num  = n;
        boolean x = true;
        while(x){
            int pro = 1;
            n = num;
            while(n!=0){
                pro *= (n % 10);
                n/=10;
            }
            if(pro % t == 0) return num;
            num++;
        }
        return 0;
    }
}