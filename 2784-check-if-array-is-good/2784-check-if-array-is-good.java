import java.util.*;
class Solution {
    public boolean isGood(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int n:nums){
            max = Math.max(n,max);
        }
        if(nums.length!=max+1){
            return false;
        }
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        for(int n : nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int n = (max-1)*(max)/2;
        int sum=0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getKey()!=max && entry.getValue()==1){
                sum+=entry.getKey();
            }
        }
        return sum==n && map.get(max)==2;
    }
}