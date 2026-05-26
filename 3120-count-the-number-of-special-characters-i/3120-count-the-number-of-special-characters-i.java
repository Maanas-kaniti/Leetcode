import java.util.*;
class Solution {
    public int numberOfSpecialChars(String word) {
        HashMap<Character,Set<Character>> map = new HashMap<>();
        for(char n : word.toCharArray()){

        char lower = Character.toLowerCase(n);

         map.putIfAbsent(lower, new HashSet<>());

        map.get(lower).add(n);
        }
        System.out.println(map.toString());
        int c = 0;
        for(Map.Entry<Character,Set<Character>> entry : map.entrySet()){
            int value = entry.getValue().size();
            if(value>1) c++;
        }
        return c;
    }
}