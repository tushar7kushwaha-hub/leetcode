import java.util.*;
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int boatCount=0;
        int left = 0;
        int right=people.length-1;
        while(left<=right){
            int sum = people[left]+people[right];
            if(sum>limit){
                boatCount++;
                right--;
            }else{
                boatCount++;
                left++;
                right--;
            }
        }
        return boatCount;
                
    }
}