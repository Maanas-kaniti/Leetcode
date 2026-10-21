class Solution {
    static int dp(int[][] g , int i , int j , int[][] memo){
        int n = g.length;
        int m = g[0].length;
        if(g[0][0]==1) return 0;
        if(i==n-1 && j==m-1) return 1;
        if(i>n-1 || j>m-1) return 0;
        if(g[i][j]==1) return 0;
        if(g[n-1][m-1]==1) return 0;
        
        if(memo[i][j]!=-1) return memo[i][j];
        int r = 0,d=0;
        r+=dp(g,i,j+1,memo);
        d+=dp(g,i+1,j,memo);
        memo[i][j] = d+r;
        return memo[i][j];
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] memo = new int[obstacleGrid.length][obstacleGrid[0].length];
        for(int[] row : memo){
            Arrays.fill(row,-1);
        }
        return dp(obstacleGrid,0,0,memo);
    }
}