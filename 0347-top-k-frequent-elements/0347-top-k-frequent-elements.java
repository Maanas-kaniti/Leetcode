import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        List<Integer>[] bucket = new ArrayList[nums.length + 1];
        for (int n : map.keySet()) {
            int freq = map.get(n);
            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(n);
        }
        int[] res = new int[k];
        int index = 0;
        for (int i = bucket.length - 1; i >= 0; i--) {

            if (bucket[i] != null) {
                for (int n : bucket[i]) {
                    if(k!=0){
                        res[index]=n;
                        k--;
                        index++;
                    }
                    else break;
                    
                }
            }

        }
        return res;
    }
}
