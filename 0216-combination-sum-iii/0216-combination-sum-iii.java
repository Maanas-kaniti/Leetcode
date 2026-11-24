class Solution {
    public List<List<Integer>> backtrack(int k, int n,int i,List<Integer> curr , List<List<Integer>> res){
        if(n==0 && curr.size()==k){
            res.add(new ArrayList<>(curr));
            return res;
        }
        if(i>9){
            return res;
        }
        
        if(n-i>=0){
            curr.add(i);
            backtrack(k,n-i,i+1,curr,res);
            curr.remove(curr.size()-1);
        }
        backtrack(k,n,i+1,curr,res);
        return res;
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        return backtrack(k,n,1,new ArrayList<>(),new ArrayList<>());
    }
}