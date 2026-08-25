class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : nums){
            if(n%k==0){
                map.put(n,k);
            }
        }
        int i = 1;
        while(true){
            if(!map.containsKey(i*k)){
                break;
            }
            i++;
        }
        return i*k;
    }
}