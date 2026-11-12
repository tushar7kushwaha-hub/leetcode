import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;
class Solution {
    public int minDeletionSize(String[] strs) {
    int count = 0;
      List<String> mainList = new ArrayList<>();
      for(int i = 0; i < strs[0].length(); i++){
        List<Character> sec = new ArrayList<>();
        for(int j=0;j<strs.length; j++){
            String sss= strs[j];
            char c = sss.charAt(i);
            sec.add(c);
        }
        mainList.add(
            sec.stream()
                    .map(String::valueOf)
                    .collect(Collectors.joining())
        );
      }
      for(String s : mainList){
        String ss = s.chars()
                .sorted()
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        if(!s.equals(ss)){
            count++;
        }
      }  
      return count;
    }
}