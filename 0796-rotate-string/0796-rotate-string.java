import java.util.*;
class Solution {
    
    public boolean rotateString(String s, String goal) {
        int n = s.length();
        char[] str = new char[n*2];
        for(int i = 0;i<s.length();i++){
            str[i] = s.charAt(i);
            str[s.length()+i] = s.charAt(i);
        }
        boolean flag = false;
        for(int i = 0;i<str.length-s.length()+1;i++){
            if(goal.equals(new String(str,i,s.length()))){
                flag = true;
                break;
            }
            
        }
        return flag;
    }
}