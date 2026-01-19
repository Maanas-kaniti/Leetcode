import java.util.*;
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        System.out.println(map.toString());
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()>1){
                arr.add(entry.getKey());
            }
        }
        return arr;
    }
    
}