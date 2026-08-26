import java.util.*;
class Solution {
    public int maxDepth(String s) {
        Stack<Character> stack = new Stack<>();
        int max = 0;
        int count  = 0;
        for(char c : s.toCharArray()){
            if(c=='('){
                stack.add(c);
            }
            else if(c==')'){
                stack.pop();
            }
            max = Math.max(stack.size(),max);
        }
        return max;
    }
}