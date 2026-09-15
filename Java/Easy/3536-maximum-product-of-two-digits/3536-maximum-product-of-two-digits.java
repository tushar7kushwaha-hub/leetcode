class Solution {
    public int maxProduct(int n) {
        LinkedList<Integer> num = new LinkedList<>();
        if(n<2) return 0;

        while(n>0){
            num.push(n%10);
            n/=10;
        }
        num.sort(null);
        int secL = 0;
        int lar = 0;
        if (num.size() >= 2) {
            secL = num.get(num.size() - 2);
            lar = num.get(num.size() - 1);
        }
        return (secL*lar);
    }
}