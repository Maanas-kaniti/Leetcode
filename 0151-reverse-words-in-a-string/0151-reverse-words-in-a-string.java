import java.util.*;
class Solution {
    public String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        int word = 0;
        StringBuilder w = new StringBuilder();
        int i = s.length()-1;
        int j = 0;
        for(char c : s.toCharArray()){
            if(c!=' ') word++;
        }
        System.out.println(word);
        while(i>=0){
            if(s.charAt(i)!=' '){
                w.insert(0,s.charAt(i));
                word--;
            }
            else if(s.charAt(i)==' '){
                if(w.length()>0){
                    res.append(w);
                    if(word>0){
                        res.append(' ');
                    }
                }
                w.setLength(0);
            }
            i--;
        }
        return res.append(w).toString();
    }
}