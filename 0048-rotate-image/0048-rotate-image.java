import java.util.*;
class Solution {
    public void rotate(int[][] matrix) {
        for(int i = 0;i<matrix.length;i++){
            for(int j = i+1;j<matrix[i].length;j++){
                if(i!=j){
                   
                    matrix[i][j] = matrix[i][j]+matrix[j][i];
                    matrix[j][i] = matrix[i][j]-matrix[j][i];
                    matrix[i][j] = matrix[i][j] - matrix[j][i];
                }
            }
        }
        int n = matrix[0].length;
        for(int i = 0;i<matrix.length;i++){
            int l = 0;
            int r = n-1;
            while(l<r){
                
                matrix[i][l] = matrix[i][l] + matrix[i][r];
                matrix[i][r] = matrix[i][l] - matrix[i][r];
                matrix[i][l] = matrix[i][l] - matrix[i][r];
                l++;
                r--;
            }
        }
    }
}