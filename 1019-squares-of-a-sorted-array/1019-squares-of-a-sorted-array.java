class Solution {
    public int[] sortedSquares(int[] arr) {
        int n = arr.length;
        for(int i = 0;i<n;i++){
            arr[i] = arr[i]*arr[i];
        }
        for(int j = 0;j<n;j++){
            for(int k = 0;k<n-j-1;k++){
                if(arr[k]>arr[k+1]){
                    int temp = arr[k];
                    arr[k] = arr[k+1];
                    arr[k+1] = temp;
                }
            }
        }
        return arr;
    }
}