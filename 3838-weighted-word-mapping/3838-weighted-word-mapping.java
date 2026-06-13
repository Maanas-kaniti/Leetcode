class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String res = "";
        for(String s : words ){
            int sum = 0;
            for(int i = 0;i<s.length();i++){
                sum+=weights[s.charAt(i)-'a'];
            }
            char ch = (char)('a'+25-sum%26);
            res+=ch;
        }
        return res;
    }
}