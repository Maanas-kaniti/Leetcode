import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for(int i = 0;i<nums.length;i++){
            int res = target-nums[i];
            if(map.containsKey(nums[i])){
                result = new int[]{map.get(nums[i]),i};
                return result;
            }
            else{
                map.put(res,i);
            }
        }
        return result;
    }
}