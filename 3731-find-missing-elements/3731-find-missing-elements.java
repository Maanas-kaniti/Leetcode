class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        boolean[] bool = new boolean[101];
        int min = nums[0];
        int max = nums[0];
        List<Integer> res = new ArrayList<>();
        for(int n : nums){
            min = Math.min(min,n);
            max = Math.max(max,n);
        }
        for(int n : nums){
            bool[n] = true;
        }
        for(int i = min;i<max+1;i++){
            if(bool[i]==false){
                res.add(i);
            }
        }
        return res;
    }
}