class Solution {
    public int maxVowels(String s, int k) {
        int vowel = Integer.MIN_VALUE;
        int count = 0;
        for(int i = 0; i<k; i++){
            char ch = s.charAt(i);
            if(ch == 'a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        vowel=Math.max(vowel,count);
        int left = 1;
        int right = k;
        while(right<s.length()){
            char ch = s.charAt(right);
            if(ch == 'a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
            char ch1 = s.charAt(left-1);
            if(ch1 == 'a'|| ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u'){
                count--;
            }

            vowel=Math.max(vowel,count);
            left++;
            right++;
        }
        return vowel;
    }
}