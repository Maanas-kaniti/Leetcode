import java.util.*;
class Solution {
    public int numberOfSpecialChars(String word) {
       boolean[] lower = new boolean[26];
       boolean[] upper = new boolean[26];
       System.out.println(Arrays.toString(lower));
       for(char ch : word.toCharArray()){
        if(Character.isLowerCase(ch)){
            lower[ch-'a'] = true;
        }
        else upper[ch-'A'] = true;
       }
       int c = 0;
       for(int i = 0;i<lower.length;i++){
        if(lower[i] && upper[i]) c++;
       }
       return c;
    }
}