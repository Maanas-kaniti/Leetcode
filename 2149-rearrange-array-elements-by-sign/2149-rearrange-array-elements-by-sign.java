class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] pos = new int[nums.length/2];
        int[] neg = new int[nums.length/2];
        int p = 0 , n = 0;
        for(int i : nums){
            if(i<0){
                neg[n]=i;
                n++;
            }
            else{
                pos[p] = i;
                p++;
            }
        }
        p = 0;
        n = 0;
        for(int i = 0;i<nums.length;i++){
            if(i%2==0){
                nums[i] = pos[p];
                p++;
            }
            else{
                nums[i] = neg[n];
                n++;
            }
        }
        return nums;
    }
}