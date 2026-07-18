class Solution {
    public int findGCD(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        for(int i = 0;i<nums.length;i++){
            max = Math.max(max,nums[i]);
            min = Math.min(min,nums[i]);
        }
        int gcd=0;
        for(int i = 1;i<max+1;i++){
            if(min%i==0 & max%i==0){
                gcd = Math.max(gcd,i);
            }
        }
        return gcd;
    }
}