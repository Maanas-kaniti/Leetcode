class Solution {
    // static boolean check(int i, int j, int[][] mat) {
    //     int ans = mat[i][j];
    //     int left = (j == 0) ? -1 : mat[i][j - 1];
    //     int right = (j == mat[0].length - 1) ? -1 : mat[i][j + 1];
    //     int top = (i == 0) ? -1 : mat[i - 1][j];
    //     int down = (i == mat.length - 1) ? -1 : mat[i + 1][j];
    //     if (ans > left && ans > right && ans > top && ans > down)
    //         return true;
    //     return false;

    // }

    public int[] findPeakGrid(int[][] mat) {
        int[] res = new int[2];
        for(int i = 0;i<mat.length;i++){
            int l = 0;
            int r = mat[0].length-1;
            while(l<=r){
                int mid = l+(r-l)/2;
                int ans = mat[i][mid];
                int left = (mid==0) ? -1 : mat[i][mid-1];
                int right = (mid==mat[0].length-1)? -1 : mat[i][mid+1];
                int top = (i==0) ? -1 : mat[i-1][mid];
                int down = (i==mat.length-1) ? -1 : mat[i+1][mid];
                if(ans > left && ans > right && ans > top && ans > down){
                    res[0] = i;
                    res[1] = mid;
                    return res;
                }
                else if(left > right){
                    r = mid -1;
                }
                else l = mid+1;
                
            }
        }
        return res;
    }
}