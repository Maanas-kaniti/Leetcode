class Solution {
    static List<List<Integer>> recurse(int n,int k , int l , List<Integer> list){
        List<List<Integer>> res = new ArrayList<>();
        if(k==0){
            res.add(new ArrayList<>(list));
            return res;
        }
        for(int i = l;i<=n;i++){
            list.add(i);
            res.addAll(recurse(n,k-1,i+1,list));
            list.remove(list.size()-1);
        }
        return res;
    }
    public List<List<Integer>> combine(int n, int k) {
        return recurse(n,k,1,new ArrayList<>());
    }
}