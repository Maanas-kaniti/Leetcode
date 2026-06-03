class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int min_land = Integer.MAX_VALUE;
        for(int i = 0;i<landStartTime.length;i++){
            min_land = Math.min(min_land,landStartTime[i]+landDuration[i]);
        }
        int min_water = Integer.MAX_VALUE;
        for(int i = 0;i<waterStartTime.length;i++){
            min_water = Math.min(min_water,waterStartTime[i]+waterDuration[i]);
        }
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<waterStartTime.length;i++){
            min=Math.min(min , Math.max(min_land,waterStartTime[i])+waterDuration[i]); 
        }
        for(int i = 0;i<landStartTime.length;i++){
            min = Math.min(min , Math.max(min_water,landStartTime[i])+landDuration[i]);
        }
        return min;
    }
}