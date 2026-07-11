class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l = 0;
        int sum = 0;
        for (int n : weights) {
            sum += n;
            l = Math.max(l, n);
        }
        int r = sum;
        int ans = 0;
        while (l <= r) {
            int mid = l+(r-l)/2;
            int count = 0;
            int day = 1;
            System.out.println(l+" "+mid+" "+r);
            int i = 0;
            while(i<weights.length){
                if(count+weights[i]<=mid){
                    count += weights[i];
                    // System.out.println(count);
                    i++;
                }
                else{
                    // System.out.println("day");
                    day++;
                    count = 0;
                }
            }
            // System.out.println(day);
            if(day<=days){
                ans = mid;
                r = mid-1;
            }
            else l = mid+1;
        }
        return ans;
    }
}