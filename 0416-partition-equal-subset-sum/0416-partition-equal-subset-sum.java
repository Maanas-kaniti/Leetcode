
class Solution {
    static boolean dp(int[] arr , int i , int sum , Boolean[][] memo){
        if(sum==0) return true;
        if(i==arr.length) return false;
        if(memo[i][sum]!=null) return memo[i][sum];
        if(arr[i]>sum) return dp(arr,i+1,sum,memo);
        return memo[i][sum] =  dp(arr,i+1,sum,memo) || dp(arr,i+1,sum-arr[i],memo);
    }
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i : nums){
            sum+=i;
        }
        if(sum%2==1) return false;
        Boolean memo[][] = new Boolean[nums.length][sum];
        for(Boolean[] row : memo){
            Arrays.fill(row,null);
        }
        return dp(nums,0,sum/2,memo);
    }
}