import java.util.*;
class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int count = 1;
        int ans = 0;
        while(n>0){
            if(n>8){
                n-=8;
                ans += 8*count;
                count++;
            }
            else{
                if(n<=8){
                    ans+=n*count;
                    n-=n;
                }
            }
        }
        return ans;
    }
}