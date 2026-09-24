class Solution {
    static boolean isTanisha(int x , int y){
        int t = x;
        int sum = 0;
        while(x>0){
            int digit = x%10;
            sum+=digit;
            x = x/10;
        }
        System.out.println(sum);
        return sum==y;
    }
    public int smallestIndex(int[] nums) {
        int ans = -1;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]<10 && nums[i]==i){
                return i;
            }
            else{
                boolean bhavishya = isTanisha(nums[i],i);
                if(bhavishya){
                    return i;
                }
            }
        }
        return ans;
    }
}