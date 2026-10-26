class Solution {
    public int recurse(int[][] mat, int i , int j,int[][] memo){
        int m = mat[0].length;
        int n = mat.length;
        if(i<0 || i>=n || j<0|| j>=m) return 0;
        if(memo[i][j]!=-1) return memo[i][j];
        int left  = (j-1>=0 && mat[i][j-1]>mat[i][j]) ? 1+recurse(mat,i,j-1,memo) : 0;
        int right =(j+1<m && mat[i][j+1]>mat[i][j]) ? 1+ recurse(mat,i,j+1,memo) : 0;
        int down =(i+1<n && mat[i+1][j]>mat[i][j]) ?  1+ recurse(mat,i+1,j,memo) : 0;
        int up =(i-1>=0 && mat[i-1][j]>mat[i][j]) ? 1+recurse(mat,i-1,j,memo) : 0;
        memo[i][j] = Math.max(left,Math.max(right,Math.max(up,down)));
        return memo[i][j];
    }
    public int longestIncreasingPath(int[][] matrix) {
        int max = 0;
        int path = 1;
        int[][] memo = new int[matrix.length][matrix[0].length];
        for(int[] row : memo){
            Arrays.fill(row,-1);
        } 
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[i].length;j++){
                path = recurse(matrix,i,j,memo);
                max = Math.max(max,path);
            }
        }
        return max+1;
    }
}