import java.util.*;
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] copy = Arrays.copyOf(arr,arr.length);
        Arrays.sort(copy);
        int rank = 1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : copy){
            if(!map.containsKey(n)){
                map.put(n,rank);
                rank++;
            }
        }
        // System.out.println(map.toString());
        for(int i = 0;i<arr.length; i++){
            copy[i] = map.get(arr[i]);
        }
        return copy;
    }
}