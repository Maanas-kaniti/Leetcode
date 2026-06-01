import java.util.*;
class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int i = cost.length-1;
        int count = 0;
        int sum = 0;
        while(i>=0){
            sum+=cost[i];
            count++;
            if(count==2){
                i--;
                count = 0;
            }
            i--;
        }
        return sum;
        
    }
}