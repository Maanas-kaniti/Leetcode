import java.util.*;
class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int index = 0;
        int c = 0;
        while(index<costs.length){
            coins-=costs[index];
            if(coins>=0){
                c++;
            }
            else break;
            index++;
           
        }
        return c;
    }
}