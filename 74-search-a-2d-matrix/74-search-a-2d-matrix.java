class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int start = 0;
        int row = 0;
        int end = matrix[0].length-1;
        for(int i = 0; i < matrix.length; i++){
            if(target>=matrix[i][0]){
                row = i;
                continue;
            
            }
            else{
                row = i>0?i-1:0;
                break;
            }
            
        }
        int mid = start + (end - start)/2;
        while(start<end){
            if(matrix[row][mid] == target){
                return true;
            }
            else if(matrix[row][mid]<target){
                start = mid + 1;
            }else{
                end = mid;
            }
            mid = start + (end - start)/2;
        }
        return matrix[row][mid]==target?true:false;
    }
}