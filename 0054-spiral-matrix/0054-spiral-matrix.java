import java.util.*;
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<Integer>();
        int rows = 0;
        int cols = 0;
        int cole = matrix[0].length-1;
        int rowe = matrix.length-1;
        while(rows<=rowe && cols<=cole){
            for(int i = cols ;i<=cole ;i++){
                res.add(matrix[rows][i]);
            }
            rows++;
            for(int i = rows ;i<=rowe;i++){
                res.add(matrix[i][cole]);
            }
            cole--;
            if(rows<=rowe){
                for(int i = cole;i>=cols;i--){
                res.add(matrix[rowe][i]);
            }
            rowe--;
            }
            
           if(cols<=cole){
             for(int i = rowe ;i>=rows;i--){
                res.add(matrix[i][cols]);
            }
            cols++;
           }
            
        }
        return res;
    }
}