class Solution {
    static int sd(int n){
        int sum = 0;
        while(n>0){
            int digit = n%10;
            sum+=digit;
            n=n/10;
        }
        return sum;
    }
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<nums.length;i++){
            min = Math.min(min,sd(nums[i]));
        }
        return min;
    }
}