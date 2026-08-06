class Solution {
    public int smallestNumber(int n, int t) {
        int i = n;
        boolean flag = true;
        while(i<101){
            int k = i;
            int p = 1;
            while(k>0){
                int digit = k%10;
                p*=digit;
                k/=10;
            }
            if(p%t==0) return i;
            i++;
        }
        return i;
    }
}