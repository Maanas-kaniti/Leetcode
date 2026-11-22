class Solution {
    public List<List<Integer>> backtrack(int[] nums,int i , List<Integer> curr,List<List<Integer>> res){
        if(i == nums.length){
            res.add(new ArrayList<>(curr));
            return res;
        }
        curr.add(nums[i]);
        backtrack(nums,i+1,curr,res);
        curr.remove(curr.size()-1);
        while(i+1<nums.length && nums[i]==nums[i+1]){
            i++;
        }
        backtrack(nums,i+1,curr,res);
        return res;
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        return backtrack(nums,0,new ArrayList<>(),new ArrayList<>());
    }
}