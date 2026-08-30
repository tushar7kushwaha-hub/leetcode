class Solution {
    public int minimumDeletions(int[] nums) {
        if(nums.length == 1){return 1;}
        int minVal = Integer.MAX_VALUE; int idxMin = 0;
        int maxVal = Integer.MIN_VALUE; int idxMax = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]>maxVal){
                maxVal = nums[i];
                idxMax = i;
            }
            if(nums[i]<minVal){
                minVal = nums[i];
                idxMin = i;
            }
        }
        int leftSteps = 0;
        int shortLeftSteps = 0;
        int leftLoopTill = Math.max(idxMin, idxMax);
        int rightLoopTill = Math.min(idxMin, idxMax);
        
        for(int i = 0; i <=leftLoopTill; i++){
            if(i<=rightLoopTill){
                shortLeftSteps++;
            }
            leftSteps++;
        }
        int rightSteps = 0;
        int shortRightSteps = 0;
        for(int i = nums.length-1; i>=rightLoopTill; i--){
            if(i >= leftLoopTill){
                shortRightSteps++;
            }
            rightSteps++;
        }
        int third = shortLeftSteps+shortRightSteps;
        int smallest = Math.min(Math.min(rightSteps,leftSteps),third);
        return smallest;
    }
}