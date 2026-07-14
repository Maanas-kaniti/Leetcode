class Solution {
    public int findKthPositive(int[] arr, int k) {
       int l = 0;
       int r = arr.length-1;
       int count = 0;
       int ans = 0;
       int ans1 = 0;
       while(l<=r){
        int mid = l+(r-l)/2;
        count = arr[mid]-(mid+1);
        
        if(count<k){
            ans = mid;
            l = mid+1;
        }
        else {
            ans1 = mid;
            r = mid-1;
        }
       }
       
       
       return l+k;
    }
}