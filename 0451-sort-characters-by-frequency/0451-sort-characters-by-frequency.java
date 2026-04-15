import java.util.*;
class Solution {
    public String frequencySort(String s) {
        StringBuilder str = new StringBuilder();
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
         PriorityQueue<Map.Entry<Character, Integer>> pq =
            new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
            pq.addAll(map.entrySet());
        while(!pq.isEmpty()){
            Map.Entry<Character,Integer> top = pq.poll();
            char key = top.getKey();
            int value = top.getValue();
            for(int i = 0;i<value;i++){
                str.append(key);
            }
            
        }
        return str.toString();
    }
}