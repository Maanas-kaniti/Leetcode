class Solution {
    public int minAddToMakeValid(String s) {
         int n = s.length();
        int c = 0;
        int[] stack = new int[n];
        int i,index = 0;
        for(i = 0;i<n;i++){
            if (s.charAt(i)=='('){
                stack[index++] = s.charAt(i);
                c++;
            }
            else{
                if (index>0){
                    index--;
                    c--;
                }
                else{
                    c++;
                }
            }
        }
        return c;
    }
}