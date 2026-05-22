class Solution {
    public int search(int[] arr, int target) {
             int left = 0;
        int right = arr.length-1;
        int res = -1;
        if(left>right) return -1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(arr[mid]==target){
                return mid;
            }
             if (arr[left] <= arr[mid]) {

                if (target >= arr[left] && target < arr[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            else {

                if (target > arr[mid] && target <= arr[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }        
        return -1;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // int s = 0;
        // int e = nums.length-1;
        // int res = bs(nums,target,s,e);
        // return res;
    }
    // static int bs(int [] arr , int t , int s , int e){
    //     if(s>e){
    //         return -1;
    //     }
    //     int m = (s+e)/2;
    //     if(arr[m]==t){
    //         return m;
    //     }
    //     if(arr[s]<= arr[m]){
    //         if(t>=arr[s] && t<arr[m]){
    //             return bs(arr,t,s,m-1);
    //         }
    //         else return bs(arr,t,m+1,e);
    //     }
    //     if(t>arr[m] && t<=arr[e]){
    //         return bs(arr,t,m+1,e);
    //     }
    //     else return bs(arr,t,s,m-1);
    // }
}