import java.util.*;
class Solution {
    public String frequencySort(String s){
       HashMap<Character,Integer> map = new HashMap<>();
       int max = 0;
       for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
            
       }
       List<Character>[] bucket = new ArrayList[s.length()+1];
       for(char n : map.keySet()){
        int freq = map.get(n);
        if(bucket[freq]==null) bucket[freq] = new ArrayList<>();
        bucket[freq].add(n);
       }
       System.out.println(Arrays.toString(bucket));
       StringBuilder sb = new StringBuilder();
       for(int i = bucket.length-1;i>=0;i--){
        if(bucket[i]!=null){
            for(char n : bucket[i]){
                for(int j = 0;j<i;j++){
                    sb.append(n);
                }
            }
        }
       }
       return sb.toString();
    }

}