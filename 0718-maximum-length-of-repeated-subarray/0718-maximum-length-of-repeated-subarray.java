class Solution {
    public int dp(int[] nums1 , int[] nums2 , int i , int j , int[][] memo){
        if(i==nums1.length || j==nums2.length) return 0;
        if(memo[i][j]!=-1) return memo[i][j];
        if(nums1[i]==nums2[j]){
            return memo[i][j] = 1 + dp(nums1,nums2,i+1,j+1,memo);
            
        }
        return memo[i][j]= 0;
    }
    public int findLength(int[] nums1, int[] nums2) {
        int memo[][] = new int[nums1.length+1][nums2.length+1];
        for(int[] row : memo){
            Arrays.fill(row,-1);
        }
        int max = 0;
        for(int i = 0;i<nums1.length;i++){
            for(int j = 0;j<nums2.length;j++){
                max = Math.max(max,dp(nums1,nums2,i,j,memo));
            }
        }
        return max;
    }
}