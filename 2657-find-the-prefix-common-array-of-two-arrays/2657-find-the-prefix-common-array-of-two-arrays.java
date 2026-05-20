import java.util.*;
class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] c = new int[A.length];
        int count = 0;
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        for(int i = 0;i<A.length;i++){
            map.put(A[i],map.getOrDefault(A[i],0)+1);
            map.put(B[i],map.getOrDefault(B[i],0)+1);

            if(A[i]==B[i]){
                count++;
            }
            else{
                if(map.get(A[i])>1){
                    count++;
                }
                if(map.get(B[i])>1){
                    count++;
                }
            }
            c[i] = count;
        }
        return c;
    }
}