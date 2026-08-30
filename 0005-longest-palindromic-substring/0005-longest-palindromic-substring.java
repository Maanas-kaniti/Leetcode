class Solution {
    public String longestPalindrome(String s) {
        int i = 0;
        int j = 0;
        int start = 0;
        int end = 0;
        int len = 0;
        StringBuilder sb = new StringBuilder();
        while (i < s.length()) {
            if (j < s.length()) {
                boolean flag = true;
                
                int m = i;
                int n = j;
                while(m<n){
                    if(s.charAt(m)!=s.charAt(n)){
                        flag = false;
                        break;
                    }
                    m++;
                    n--;
                }
                if (flag) {
                    if (j - i + 1 > len) {
                        len = j - i + 1;
                        start = i;
                        end = j;
                    }

                }
                j++;
            } else {
                i++;
                j = i;
            }
        }
        for (int k = start; k <= end; k++) {
            sb.append(s.charAt(k));
        }
        return sb.toString();
    }
}