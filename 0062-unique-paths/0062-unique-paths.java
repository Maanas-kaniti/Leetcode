import java.util.*;
class Solution {
    static int dp(int m ,int n , int i , int j , int[][] memo){
        if(i==m-1|| j==n-1) return 1;
        if(i==m || j==n) return 0;
        if(memo[i][j]!=-1) return memo[i][j];
        int down = 0;
        down+=dp(m,n,i+1,j,memo);
        int right = 0;
        right+=dp(m,n,i,j+1,memo);
        memo[i][j] = right+down;
        return memo[i][j];
    }

    public int uniquePaths(int m, int n) {
        int[][] memo = new int[m][n];
        for(int[] row : memo){
            Arrays.fill(row,-1);
        }
        return dp(m,n,0,0,memo);
    }
}