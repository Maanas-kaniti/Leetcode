import java.util.*;
class Solution {
    public int maxProduct(int n) {
        List<Integer> res = new ArrayList<>();
        while(n>0){
            int digit = n%10;
            res.add(digit);
            n=n/10;
        }
      
        Collections.sort(res,Collections.reverseOrder());
        return res.get(0)*res.get(1);
    }
}