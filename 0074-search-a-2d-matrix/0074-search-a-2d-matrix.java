class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l = 0;
        int r = matrix.length-1;
        while(l<=r){
            int mid = l+(r-l)/2;
            System.out.println(l + " " + mid + " " +r);
            if(target<=matrix[mid][matrix[mid].length-1] && target>=matrix[mid][0]){
                 int s = 0;
                int e = matrix[mid].length-1;
                while(s<=e){
                    int m = s+(e-s)/2;
                    System.out.println(s + " " + m + " " +e);
                    if(matrix[mid][m]==target){
                        return true;
                    }
                    else if(matrix[mid][m]>target){
                        e = m-1;
                    }
                    else s = m+1;
                }
                return false;
            }
            else if(target > matrix[mid][matrix[mid].length-1]){
                l = mid+1;
            }
            else{
               r = mid-1;
            }
        }
        return false;
    }
}