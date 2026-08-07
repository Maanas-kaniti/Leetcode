import java.util.*;
class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        int open = 0;
        int close = 0;
        
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='('){
                if(count!=0) sb.append(c);
                count++;
                
            }
            else{
                count--;
                if(count!=0) sb.append(c);
                
            }
            // System.out.println(sb .toString());
            // System.out.println(open + " "+ close);
            
        }
        return sb.toString();
    }
}