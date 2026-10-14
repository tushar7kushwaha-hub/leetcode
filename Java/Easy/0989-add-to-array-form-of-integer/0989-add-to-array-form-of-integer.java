import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.math.BigInteger;
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        BigInteger arrForm = BigInteger.valueOf(0);
        for (int i : num) {
            arrForm = arrForm.multiply(BigInteger.valueOf(10)).add(BigInteger.valueOf(i));
        }
        arrForm = arrForm.add(BigInteger.valueOf(k));
        List<Integer> list = new ArrayList<>();
        BigInteger ten = BigInteger.valueOf(10);
        while (!arrForm.equals(BigInteger.ZERO)) {
            BigInteger[] divAndRem = arrForm.divideAndRemainder(ten);
            int rem = divAndRem[1].intValue(); 
            list.add(rem);
            arrForm = divAndRem[0];
        }
        
        Collections.reverse(list);
        return list;
    }
}