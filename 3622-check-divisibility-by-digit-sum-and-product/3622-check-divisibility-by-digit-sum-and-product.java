class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int prod = 1;
        int t = n;
        while(t>0){
            int digit = t%10;
            sum+=digit;
            prod*=digit;
            t=t/10;
        }
        return n%(sum+prod)==0;
    }
}