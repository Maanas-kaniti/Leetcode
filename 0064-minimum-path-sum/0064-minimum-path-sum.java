class Solution {
    static int dp(int[][] grid , int i , int j , int[][] memo){
        int n = grid.length;
        int m = grid[0].length;
        
        if(i==n-1 && j ==m-1) return grid[i][j];
        if(i>n-1 || j>m-1) return Integer.MAX_VALUE;
        if(memo[i][j]!=-1) return memo[i][j];
        int r=0,d=0,dia=0;

        r = dp(grid,i,j+1,memo);

        d = dp(grid,i+1,j,memo);

        int min = Integer.MAX_VALUE;
        min = Math.min(min,r);
        min = Math.min(min,d);
        memo[i][j] = grid[i][j]+min;
        return memo[i][j];
    }
    public int minPathSum(int[][] grid) {
        int[][] memo = new int[grid.length][grid[0].length];
        for(int[] row : memo){
            Arrays.fill(row,-1);
        }
        return dp(grid,0,0,memo);
    }
}