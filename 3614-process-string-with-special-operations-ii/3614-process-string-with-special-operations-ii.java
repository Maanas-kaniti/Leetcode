import java.util.*;
class Solution {
    public char processStr(String s, long k) {
        
        String str = "";
        long len = 0;
        for(int i  = 0 ;i<s.length();i++){
            if(s.charAt(i)=='#'){
                len*=2;
            }
            else if(s.charAt(i)=='*'){
                if(len>0){
                    len--;
                }
            }
            else if(s.charAt(i)=='%') continue;
            else len++;
        }
        if(len<=k) return '.';
        int index = s.length()-1;
        while(index>=0){
                if(s.charAt(index)=='#'){
                long half = len/2;
                if(k>=half){
                    k -=half;
                }
                len=len/2;
            }
            else if(s.charAt(index)=='*') len++;
            else if(s.charAt(index)=='%'){
                k = len-k-1;
            }
            else{
                if(k==len-1){
                    return s.charAt(index);
                }
                len--;
            };
        index--;
        }
        
        return '.';
    }
}