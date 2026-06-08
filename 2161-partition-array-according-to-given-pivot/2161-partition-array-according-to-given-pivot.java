class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] res = new int[nums.length];
        int i = 0;
        int j = 0;
        int k = 0;
        int index = 0;
        while(i<nums.length){
            if(nums[i]<pivot){
                res[index] = nums[i];
                index++;
            }
            i++;
        }
        while(j<nums.length){
            if(nums[j]==pivot){
                res[index] = nums[j];
                index++;
            }
            j++;
        }
        while(k<nums.length){
            if(nums[k]>pivot){
                res[index] = nums[k];
                index++;
            }
            k++;
        }
        return res;
    }
}