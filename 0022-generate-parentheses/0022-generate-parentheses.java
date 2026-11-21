class Solution {
    static List<String> recurse(int n,String s,int o ,int c){
        List<String> res = new ArrayList<>();
        if(o==0 && c==0){
            res.add(s);
            return res;
        }
        if(o>0){
            s =  s+"(";
            res.addAll(recurse(n,s,o-1,c));
            s = s.substring(0,s.length()-1);
        }
        
        if(c>0 && c>o){
            s = s+")";
            res.addAll(recurse(n,s,o,c-1));
            s = s.substring(0,s.length()-1);
        }
        

        return res;
    }
    public List<String> generateParenthesis(int n) {
        return recurse(n,"(",n-1,n);
    }
}