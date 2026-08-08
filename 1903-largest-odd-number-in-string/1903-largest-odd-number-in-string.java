class Solution {
    public String largestOddNumber(String num) {
        int i = num.length()-1;
        int max = -1;
        while(i>=0){
            char ch = num.charAt(i);
            int n = ch - '0';
            
            if(n%2==1){
                if(n>max){
                    max = i;
                }
                break;
            }
            i--;
        }
        if(max==-1) return "";
        return new String(num.toCharArray(),0,max+1);
    }
}