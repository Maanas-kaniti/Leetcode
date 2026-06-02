import java.util.*;
class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<landStartTime.length;i++){
            int land = landStartTime[i]+landDuration[i];
            for(int j = 0;j<waterStartTime.length;j++){
                min = Math.min(min , Math.max(land,waterStartTime[j])+waterDuration[j]);
            }
        }
        for(int i = 0;i<waterStartTime.length;i++){
            int water = waterStartTime[i]+waterDuration[i];
            for(int j = 0;j<landStartTime.length;j++){
                min = Math.min(min , Math.max(water,landStartTime[j])+landDuration[j]);
            }
        }
        return min;
    }
}