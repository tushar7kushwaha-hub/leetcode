class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int len = m*n;
        for(int i=0; i<n; i++){
            if(target == matrix[i][0]) return true;
            if(target>matrix[i][0]){
                for(int j = 1; j<m; j++){
                    if(matrix[i][j]==target) return true;
                }
            }
        }
        return false;
    }
}