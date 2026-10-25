class Solution {
    public int recurse(String word1,String word2 ,int i,int j,int[][] memo){
        if (i == 0) return j;
        if (j == 0) return i;
        if(memo[i][j]!=-1) return memo[i][j];
        int ch1 = word1.charAt(i-1);
        int ch2 = word2.charAt(j-1);
        
        if(ch1==ch2){
            
            return memo[i][j] = recurse(word1,word2,i-1,j-1,memo);
        }
        
        int insert = 1 + recurse(word1, word2, i, j - 1,memo);
        int delete = 1 + recurse(word1, word2, i - 1, j,memo);
        int replace = 1 + recurse(word1, word2, i - 1, j - 1,memo);
        return memo[i][j] = Math.min(insert,Math.min(delete,replace));
    }

    public int minDistance(String word1, String word2) {
        int[][] memo = new int[word1.length()+1][word2.length()+1];
        for(int[] row : memo){
            Arrays.fill(row,-1);
        }
        return recurse(word1, word2,word1.length(),word2.length(),memo);
    }
}