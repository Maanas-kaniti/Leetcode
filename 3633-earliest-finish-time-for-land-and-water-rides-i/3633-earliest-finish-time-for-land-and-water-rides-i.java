import java.util.*;
class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0;i<landStartTime.length;i++){
            int land = landStartTime[i]+landDuration[i];
            for(int j = 0;j<waterStartTime.length;j++){
                if(waterStartTime[j]<=land){
                    arr.add(land+waterDuration[j]);
                }
                else{
                    arr.add(waterStartTime[j]+waterDuration[j]);
                }
            }
        }
        for(int i = 0;i<waterStartTime.length;i++){
            int water = waterStartTime[i]+waterDuration[i];
            for(int j = 0;j<landStartTime.length;j++){
                if(landStartTime[j]<=water){
                    arr.add(water+landDuration[j]);
                }
                else{
                    arr.add(landStartTime[j]+landDuration[j]);
                }
            }
        }
        Collections.sort(arr);
        return arr.get(0);
    }
}