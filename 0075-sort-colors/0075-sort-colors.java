class Solution {
    public void sortColors(int[] arr) {
        int lo = 0 , mid = 0 , hi = arr.length-1;

        while(mid<=hi){
            if(arr[mid]==0){
                int temp = arr[lo];
                arr[lo++] = arr[mid];
                arr[mid++] = temp;
            }
            else if(arr[mid]==2){
                int temp = arr[mid];
                arr[mid] = arr[hi];
                arr[hi--] = temp;
            }
            else{mid++;}
        }
    }
}