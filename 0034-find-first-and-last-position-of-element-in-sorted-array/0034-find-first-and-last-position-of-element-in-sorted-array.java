class Solution {
    public int[] searchRange(int[] arr, int target) {
        int[] res = { -1, -1 };
        int l1 = 0, h1 = arr.length - 1;
        while (l1 <= h1) {
            int mid = l1 + (h1 - l1) / 2;
            if (arr[mid] >= target) {
                if (arr[mid] == target)
                    res[0] = mid;
                h1 = mid - 1;
            } else
                l1 = mid + 1;
        }
        int l2 = 0;
        int h2 = arr.length - 1;
        while (l2 <= h2) {
            int mid = l2 + (h2 - l2) / 2;
            // System.out.println(l2 + " "+ mid+" "+h2);
            if (arr[mid] <= target) {
                if (arr[mid] == target) {
                    res[1] = mid;
                    
                }
                l2 = mid + 1;
            } else h2 = mid - 1;
                
        }

        return res;
    }
}