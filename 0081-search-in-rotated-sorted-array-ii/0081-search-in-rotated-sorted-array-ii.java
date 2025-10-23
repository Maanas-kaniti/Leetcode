class Solution {
    public boolean search(int[] nums, int target) {
        boolean res = bs(nums,target,0,nums.length-1);
        return res;
    }
    static boolean bs(int[] arr,int t,int s, int e){
        if(s>e) return false;
        int m = (s+e)/2;
        if(arr[m]==t) return true;
        if(arr[s]<=arr[m]){
            if(t>=arr[s] && t < arr[m]) return bs(arr,t,s,m-1);
            else return bs(arr,t,m+1,e);
        }
        if(t>arr[m] && t<=arr[e]) return bs(arr,t,m+1,e);
        else return bs(arr,t,s,m-1);
    }
}