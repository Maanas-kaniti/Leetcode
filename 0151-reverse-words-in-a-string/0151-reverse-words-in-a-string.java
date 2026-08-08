class Solution {
    public String reverseWords(String s) {
        String res = "";
        int word = 0;
        String w = "";
        int i = s.length()-1;
        int j = 0;
        for(char c : s.toCharArray()){
            if(c!=' ') word++;
        }
        System.out.println(word);
        while(i>=0){
            if(s.charAt(i)!=' '){
                w = s.charAt(i)+w;
                word--;
            }
            else if(s.charAt(i)==' '){
                if(w.length()>0) res = res +w+(word != 0 ? " " : "") ;
                w = "";
            }
            i--;
        }
        return res+w;
    }
}