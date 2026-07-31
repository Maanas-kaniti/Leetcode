import java.util.*;
class Solution {
    public int minimumPushes(String word) {
        int count = 1;
        int c = 1;
        Map<Character,Integer> map = new TreeMap<>(Collections.reverseOrder());
        for(char n : word.toCharArray()){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        List<Integer> l = new ArrayList<>(map.values());
        
        int ans = 0;
        System.out.println(l.toString());
        Collections.sort(l,Collections.reverseOrder());
        for(int i = 0;i<l.size();i++){
            if(count<8){
                ans+=l.get(i)*c;
                count++;
            }
            else{
                ans+=l.get(i)*c;
                c++;
                count=1;
            }
        }
        return ans;
    }
}