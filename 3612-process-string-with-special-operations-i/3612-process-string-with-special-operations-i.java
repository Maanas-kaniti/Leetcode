import java.util.*;
class Solution {
    static StringBuilder removechar(StringBuilder res){
        int n = res.length();
        if(n==0) return res;
        else res.deleteCharAt(n-1);
        return res;
    }
    public String processStr(String s) {
        StringBuilder res = new StringBuilder();
        int c = 0;
        for(char ch : s.toCharArray()){
            if(ch == '#'){
                res.append(res);
            }
            else if(ch == '%'){
                res.reverse();
            }
            else if(ch == '*'){
                res = removechar(res);
            }
            else{
                res.append(ch);
            }
        }
        return res.toString();
    }
}