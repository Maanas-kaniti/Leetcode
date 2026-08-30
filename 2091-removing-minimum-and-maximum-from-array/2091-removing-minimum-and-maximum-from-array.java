class Solution {
    public int minimumDeletions(int[] nums) {
        if(nums.length==1) return 1;
        int min = nums[0];
        int minIndex = 0;
        int max = nums[0];
        int maxIndex = 0;
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]<min){
                min = nums[i];
                minIndex = i;
            }
            if(nums[i]>max){
                max = nums[i];
                maxIndex = i;
            }
        }
        int bfront = Math.max(maxIndex,minIndex)+1;
        int bback = nums.length-Math.min(maxIndex,minIndex);
        int minmax = minIndex+1+(nums.length-maxIndex);
        int maxmin = maxIndex+1+(nums.length-minIndex);
        // System.out.println(minIndex + " "+ maxIndex);
        
        // System.out.println(sum);
        return Math.min(Math.min(bfront,bback),Math.min(minmax,maxmin));

    }
}