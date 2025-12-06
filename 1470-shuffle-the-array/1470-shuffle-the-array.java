class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        // index = 0
        int i = 0;
        int j = n;
        int index = 0;
        while(index<nums.length){
            if(index%2==0){
                arr[index] = nums[i];
                i++;
            }
            else{
                arr[index] = nums[j];
                j++;
            }
            index++;

        }
        return arr;
    }
}