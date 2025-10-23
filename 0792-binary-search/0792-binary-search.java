class Solution {
    public int search(int[] nums, int target) {
        int s = 0;
        int e = nums.length-1;
        int res = bs(nums,target,s,e);
        return res;
    }
    static int bs(int[] arr , int t , int s ,int e){
        if(s>e){
            return -1;
        }
        int m =(s+e)/2;
        if(arr[m]==t){
            return m;
        }
        else if(t<arr[m]){
            return bs(arr,t,s,m-1);
        }
        return bs(arr,t,m+1,e);
    }
}