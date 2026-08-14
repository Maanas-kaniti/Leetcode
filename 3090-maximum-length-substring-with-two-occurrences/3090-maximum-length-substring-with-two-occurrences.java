import java.util.*;
class Solution {
    public int maximumLengthSubstring(String s) {
        int i = 0;
        int j = 0;
        int m = 0;
        HashMap<Character,Integer>map = new HashMap<>();
        while(j<s.length()){
            char ch = s.charAt(j);
            map.put(ch,map.getOrDefault(ch,0)+1);
            boolean flag = true;
            while(map.get(ch)>2){
                System.out.println(map.toString());
                map.put(s.charAt(i),map.get(s.charAt(i))-1);
                i++;
            }
            m = Math.max(j-i+1,m);
            j++;
        }
        return m;
    }
}