class Solution {
    public int strStr(String haystack, String needle) {
        // char[] arr1 = needle.toCharArray();
        // char[] arr2 = haystack.toCharArray();
        int index = haystack.indexOf(needle);
        if(index < 0){
            return -1;
        }
        return index;

    }
}