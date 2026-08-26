import java.util.*;
class Solution {
    public int maxDepth(String s) {
        Stack<Character> stack = new Stack<>();
        int max = 0;
        int count  = 0;
        for(char c : s.toCharArray()){
            if(c=='('){
                count++;
            }
            else if(c==')'){
                count--;
            }
            max = Math.max(count,max);
        }
        return max;
    }
}