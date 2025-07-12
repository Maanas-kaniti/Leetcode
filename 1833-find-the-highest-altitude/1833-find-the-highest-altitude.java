class Solution {
    public int largestAltitude(int[] gain) {
        int[] prefix = new int[gain.length+1];
        prefix[0] = 0;
        int max = 0;
        for(int i = 0;i<gain.length;i++){
            prefix[i+1] = gain[i]+prefix[i-1+1];
            if(prefix[i+1]>max){
                max = prefix[i+1];
            }
        }
        return max;

    }
}