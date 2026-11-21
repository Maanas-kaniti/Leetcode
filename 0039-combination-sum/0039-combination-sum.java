class Solution {
    static List<List<Integer>> back(int[] arr , int t , int i , List<Integer> curr , List<List<Integer>> res){
        if(t==0){
            res.add(new ArrayList<>(curr));
            return res;
        }
        if(i==arr.length) return res;
        if(t-arr[i]>=0){
            curr.add(arr[i]);
            back(arr,t-arr[i],i,curr,res);
            curr.remove(curr.size()-1);
        }
        back(arr,t,i+1,curr,res);
        return res;
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        return back(candidates, target , 0, new ArrayList<>(),new ArrayList<>());
    }
}