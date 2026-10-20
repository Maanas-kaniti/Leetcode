class Solution {
    public int dp(String digits , int i , int[] memo){
        if(i==digits.length()) return 1;
        if(digits.charAt(i)=='0') return 0;
        if(memo[i]!=-1) return memo[i];
        int left = dp(digits,i+1,memo);
        int right = 0;
        if(i+1<digits.length()){
            int num = (digits.charAt(i)-'0')*10+(digits.charAt(i+1)-'0');
            if(num>=10 && num<=26){
                right = dp(digits,i+2,memo);
            }
        }
        memo[i] = right+left;
        return memo[i];
    }
    public int numDecodings(String s) {
        int[] memo = new int[s.length()];
        Arrays.fill(memo,-1);
        return dp(s,0,memo);
    }
}