import java.util.*;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        int[] chs = new int[26];
        int[] cht = new int[26];
        // System.out.println(Arrays.toString(chs));
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            char ch1 = t.charAt(i);
            chs[ch - 'a']++;
            cht[ch1-'a']++;
        }
        System.out.println(Arrays.toString(chs));
        for (int i = 0; i < chs.length; i++) {
            if(chs[i]!=cht[i]) return false;
        }
        return true;
    }
}