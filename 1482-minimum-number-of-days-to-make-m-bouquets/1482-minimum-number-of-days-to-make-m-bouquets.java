class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k>bloomDay.length) return -1;
        int min = bloomDay[0];
        int max = bloomDay[0];
        for(int n : bloomDay){
            min = Math.min(min,n);
            max = Math.max(max,n);
        }
        int l = min;
        int r = max;
        int ans = -1;
        while(l<=r){
            int mid = l+(r-l)/2;
            int count = k;
            int made = 0;
            
            for(int n : bloomDay){
                if(n<=mid) count--;
                else count=k; 
                if(count== 0){
                    count = k;
                    made++;
                }
            }
            if(made>=m){
                ans = mid;
                r = mid-1;
            }
            else l = mid+1;
        }
        
        return ans;
    }
}