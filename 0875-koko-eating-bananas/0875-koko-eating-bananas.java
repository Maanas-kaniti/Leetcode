class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = piles[0];
        for(int n : piles){
            max = Math.max(n,max);
        }
        int l = 1;
        int r = max;
        int ans = 0;
        while(l<=r){
            long k = 0;
            int mid = l+(r-l)/2;
            for(int n : piles){
                 k+=(n+mid-1)/mid;
            }
            System.out.println(l + " "+mid+ " "+ r+ " "+ k);
            if(k<=h){
                ans = mid;
                r = mid -1;
            }
            else l = mid+1;
        }
        return ans;
    }
}