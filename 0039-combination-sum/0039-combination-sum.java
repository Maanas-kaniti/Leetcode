class Solution {
    static List<List<Integer>> recurse(int[] arr, int target,int l ,List<Integer> list){
        List<List<Integer>> res = new ArrayList<>();
        if(target==0){
            res.add(new ArrayList<>(list));
            return res;
        }
        if(target<0) return res;
        for(int i = l;i<arr.length;i++){
            list.add(arr[i]);
            res.addAll(recurse(arr,target-arr[i],i,list));
            list.remove(list.size()-1);
        }
        return res;
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        return recurse(candidates , target ,0, new ArrayList<>());
    }
}