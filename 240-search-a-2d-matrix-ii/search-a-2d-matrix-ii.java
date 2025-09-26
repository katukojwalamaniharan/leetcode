class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=0;
        int col=matrix[0].length-1;
        while(row<matrix.length&&col>=0){
            int cur=matrix[row][col];
            if(cur==target){
                return true;
            }else if(cur>target){
                col--;
            }else{
                row++;
            }
        }
        return false;
    }
}