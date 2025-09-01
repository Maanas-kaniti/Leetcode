import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0,j=0,len=0,max=0,n=s.length();
        Set<Character> set = new HashSet<>();
        while(i<n){
            if(j<s.length() && !set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
                len++;
                max = Math.max(len,max);
            }
            else{
                set.clear();
                i++;
                j=i;
                len=0;
            }
           
        }
         return max;
    }
}