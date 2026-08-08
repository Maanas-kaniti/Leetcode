import java.util.*;
class Solution {
    public String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        
        StringBuilder w = new StringBuilder();
        int i = s.length()-1;

        

        while(i>=0){
            if(s.charAt(i)!=' '){
                w.insert(0,s.charAt(i));
                
            }
            else if(s.charAt(i)==' '){
                if(w.length()>0){
                    res.append(w);
                    res.append(' ');
                }
                w.setLength(0);
            }
            i--;
        }
        res.append(w);
        if(res.charAt(res.length()-1)== ' '){
            res.setLength(res.length()-1);
        }
        return res.toString();
    }
}