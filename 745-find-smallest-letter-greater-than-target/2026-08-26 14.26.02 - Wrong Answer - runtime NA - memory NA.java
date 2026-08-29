class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        if(target >= letters[letters.length-1]) return letters[0];

        int L = 0;
        int R = letters.length - 1;
        while(L<=R){
            int mid = (L+R)/2;
            if(letters[mid]<=target){
                L = mid+1;
                continue;
            }
            for(int i = L; i<=R; i++){
                if(letters[i]!=target)
                return letters[i];
            }
        }
        return letters[0];
    }
}