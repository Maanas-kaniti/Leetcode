class Solution {
    public int largestAltitude(int[] gain) {
        int[] prefix = new int[gain.length+1];
        prefix[0] = 0;
        int max = 0;
        for(int i = 1;i<prefix.length;i++){
            prefix[i] = gain[i-1]+prefix[i-1];
            max = Math.max(prefix[i],max);
        }
        return max;
    }
}