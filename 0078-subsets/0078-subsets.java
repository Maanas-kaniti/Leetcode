import java.util.*;
class Solution {
    static List<List<Integer>> subseq(int[] nums , int l , int n , List<Integer> curr , List<List<Integer>> res ){
        if(l==n){
            res.add(new ArrayList<>(curr));
            return res;
        }
        curr.add(nums[l]);
        subseq(nums , l+1 , n , curr , res);
        curr.remove(curr.size()-1);
        subseq(nums , l+1 , n , curr , res);
        return res;
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res =  subseq(nums,0,nums.length,new ArrayList<>(),new ArrayList<>());
        
        return res;
    }
}