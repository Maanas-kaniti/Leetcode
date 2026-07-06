import java.util.*;
class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals,(a, b) -> {
    if (a[0] == b[0]) {
        return b[1] - a[1];   // end descending
    }
    return a[0] - b[0];       // start ascending
});
        for(int[] m : intervals){
            System.out.println(Arrays.toString(m));
        }
        int count = 0;
        int m = intervals[0][1];
    for(int i = 1;i<n;i++){
        if(intervals[i][1]<= m){
            count+=1;
        }
        m = Math.max(intervals[i][1],m);
    }
    System.out.println(count);
        return n-count;
    }
}