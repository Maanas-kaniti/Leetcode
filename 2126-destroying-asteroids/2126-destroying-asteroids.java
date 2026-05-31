import java.util.*;
class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long ans = mass;
        for(int i = 0;i<asteroids.length;i++){
            if(ans>=asteroids[i]) ans+=asteroids[i];
            else return false;
        }  
        return true;
    }
}