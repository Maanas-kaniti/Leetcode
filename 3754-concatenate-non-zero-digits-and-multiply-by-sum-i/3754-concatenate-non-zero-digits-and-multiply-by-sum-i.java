class Solution {
    public long sumAndMultiply(int n) {
        long temp = 0;
        long sum = 0;
        while(n>0){
            int digit = n%10;
            if(digit!=0){
                temp = temp*10+digit;
                sum+=digit;
            }
            n/=10;
        }
        // System.out.println(temp);
        long res = 0;
        while(temp>0){
            long digit = temp%10;
            res = res*10+digit;
            temp/=10;
        }
        // System.out.println(res);
        return res*sum;
    }
}