import java.util.*;
class Solution {
    public int[] resultArray(int[] nums) {
        int[] arr1 = new int[nums.length];
        int[] arr2 = new int[nums.length];
        arr1[0] = nums[0];
        arr2[0] = nums[1];
        int k = 1;
        int j = 1;
        for(int i = 2;i<nums.length;i++){
            if(arr1[k-1]>arr2[j-1]){
                arr1[k] = nums[i];
                k++;
            }
            else{
                arr2[j] = nums[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        for(int i = 0;i<arr2.length;i++){
            if(arr2[i]!=0){
                arr1[k] = arr2[i];
                k++;
            }
            else break;
        }  
        return arr1;
    }
}