class Solution {
    public int myAtoi(String s) {
        int num = 0;
        long n = 0;
        boolean negative = false;
        int count = 0;
        int sign = 0;
        int spaces = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                if (n*10 +(ch-'0') <= Integer.MAX_VALUE) {
                    n*= 10;
                    n += (ch - '0');
                
                } else {
                    if (negative)
                        return Integer.MIN_VALUE;
                    return Integer.MAX_VALUE;
                }
                
                count++;
            } else if (ch == '-' || ch == '+') {
                sign++;
                if (sign == 1 && count == 0) {
                    if (ch == '-')
                        negative = true;
                } else
                    break;
            } else if (ch == '.') {
                if (negative)
                
                    return -1 * (int)n;
                else
                    return (int)n;
            } else if (ch == ' '){
                if(count==0 && sign==0){
                    continue;
                }
                else break;
            }
            else
                break;

        }
        num = (int)n;
        if (negative)
            return num * -1;
        return num;
    }
}