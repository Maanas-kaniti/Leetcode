class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int m = 0;
        int area = 0;
        while(l<r){
            area = Math.min(height[l],height[r])*(r-l);
            m = Math.max(m,area);
            if(height[l]<height[r]) l++;
            else r--;
        }
        return m;
    }
}