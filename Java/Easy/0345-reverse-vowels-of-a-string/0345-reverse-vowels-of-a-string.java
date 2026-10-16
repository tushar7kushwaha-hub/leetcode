import java.util.Set;
import java.util.HashSet;
class Solution {
    public String reverseVowels(String s) {
        Set<Character> set = new HashSet();
        set.add('a');  set.add('e');  set.add('i');  set.add('o');  set.add('u');
        set.add('A');   set.add('E');  set.add('I');  set.add('O');  set.add('U');

        int l=0;
        int r=s.length()-1;
        char[] ch = s.toCharArray();
        while(l<r){
            while(l<r&&!set.contains(ch[l])){
                l++;
            }
            while(r>l&&!set.contains(ch[r])){
                r--;
            }            
            char c = ch[l];
            ch[l] = ch[r];
            ch[r] = c;
            l++;
            r--;
        }
        String str = new String(ch);
        return str;
    }
}