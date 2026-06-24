import java.util.*;
class Solution {
    public void setZeroes(int[][] matrix) {
        
        int m = matrix.length;
        int n = matrix[0].length;
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                 if(matrix[i][j]==0){
                    arr.add(new ArrayList<>(Arrays.asList(i, j)));
                }
            }
        }
        for(int i = 0;i<arr.size();i++){
        top(arr.get(i).get(0),arr.get(i).get(1),matrix);
        down(arr.get(i).get(0),arr.get(i).get(1),matrix);
        left(arr.get(i).get(0),arr.get(i).get(1),matrix);
        right(arr.get(i).get(0),arr.get(i).get(1),matrix);
    }
    }
    
    private void top(int i , int j , int[][] matrix){
        while(i>=0){
            matrix[i][j] = 0;
            i--;
        }
    }
    private void down(int i , int j , int[][] matrix){
        while(i<matrix.length){
            matrix[i][j] = 0;
            i++;
        }
    }
    private void left(int i , int j , int[][] matrix){
        while(j>=0){
            matrix[i][j] = 0;
            j--;
        }
    }
    private void right(int i , int j , int[][] matrix){
        while(j<matrix[0].length){
            matrix[i][j] = 0;
            j++;
        }
    }
}