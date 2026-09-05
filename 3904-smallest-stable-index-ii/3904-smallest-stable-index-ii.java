class Solution {
    public int firstStableIndex(int[] nums, int k) {
         int[] maxs = new int[nums.length];
        int[] mins = new int[nums.length];
        int max = nums[0];
        maxs[0] = max;
        int min = nums[nums.length-1];
        for(int i = 1;i<nums.length;i++){
            if(nums[i]>max) max = nums[i];
            maxs[i] = max;
        }
        mins[nums.length-1] = min;
        for(int i = nums.length-2;i>=0;i--){
            if(nums[i]<min) min = nums[i];
            mins[i] = min;
        }
       
        int index = -1;
        for(int i = 0;i<nums.length;i++){
            if(maxs[i]-mins[i]<=k){
                index = i;
                break;
            }
        }
        return index;
    }
}