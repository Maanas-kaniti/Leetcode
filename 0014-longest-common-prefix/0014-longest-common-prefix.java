class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        StringBuilder sb = new StringBuilder();
        int j = 0;
        
        while(j<strs[0].length()){
            int count = 0;
            for(int i = 0;i<strs.length-1;i++){
                if(j<=strs[i].length()-1 && j<=strs[i+1].length()-1){
                    if(strs[i].charAt(j) == strs[i+1].charAt(j)) count++;
                }
                else break;
            }
            if(count == strs.length-1){
                sb.append(strs[0].charAt(j));
                j++;
            }
            else break;
        }
        return sb.toString();
    }
}