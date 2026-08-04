class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //This is a better approach O(mlogn)
        // for(int i = 0;i<matrix.length;i++){
        //     int l = 0;
        //     int r = matrix[i].length-1;
        //     while(l<=r){
        //         int mid = l+(r-l)/2;
        //         if(matrix[i][mid]==target) return true;
        //         else if(matrix[i][mid]>target){
        //             r = mid-1;
        //         }
        //         else l = mid+1;
        //     }
        // }
        // return false;



        //this will be O(m+n);

        int row = 0;
        int col = matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(target==matrix[row][col]){
                return true;
            }
            else if(target<matrix[row][col]){
                col--;
            }
            else row++;
        }
        return false;
    }
}