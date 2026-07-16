import java.util.*;

class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int l = 1;
        int r = position[position.length - 1] - position[0];
        int ans = 0;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            int k = position[0];
            int count = 1;
            for (int i = 1; i < position.length; i++) {
                if (position[i] - k >= mid) {
                    k = position[i];
                    count++;
                }

            }
            if (count >= m) {
                ans = mid;
                l = mid + 1;
            } else r = mid - 1;

        }
        return ans;
    }
}