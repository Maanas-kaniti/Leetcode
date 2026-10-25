class Solution {
    public int dp(String t1, String t2 , int m , int n,int[][] memo){
        if(m==0 || n == 0) return 0;
        if(memo[m][n]!=-1) return memo[m][n];
        if(t1.charAt(m-1)==t2.charAt(n-1)){
            memo[m][n] = 1 + dp(t1,t2,m-1,n-1,memo);
            return memo[m][n];
        }
        memo[m][n] = Math.max(dp(t1,t2,m-1,n,memo),dp(t1,t2,m,n-1,memo));
        return memo[m][n];
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int memo[][] = new int[text1.length()+1][text2.length()+1];
        for(int[] row : memo){
            Arrays.fill(row,-1);
        }
        return dp(text1,text2,text1.length(),text2.length(),memo);
    }
}