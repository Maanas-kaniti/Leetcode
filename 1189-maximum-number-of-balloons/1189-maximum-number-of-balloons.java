import java.util.*;
class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] freq = new int[26];
        for(char c : text.toCharArray()){
            freq[c-'a']++;
        }
        System.out.println(Arrays.toString(freq));
        int min = freq[0];
        min = Math.min(freq[1],min);
        min = Math.min(freq[11]/2,min);
        min = Math.min(freq[13],min);
        min = Math.min(freq[14]/2,min);
        return min;
    }
}