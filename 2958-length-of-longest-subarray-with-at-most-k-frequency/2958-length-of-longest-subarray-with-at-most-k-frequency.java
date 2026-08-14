class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int i = 0;
        int j = 0;
        int m = 0;
        HashMap<Integer,Integer>map = new HashMap<>();
        while(j<nums.length){
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            while(map.get(nums[j])>k){
                // System.out.println(map.toString());
                map.put(nums[i],map.get(nums[i])-1);
                i++;
            }
            m = Math.max(j-i+1,m);
            j++;
        }
        return   m;                                                                                       
    }
}