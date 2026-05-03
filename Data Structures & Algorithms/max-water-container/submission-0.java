class Solution {
    public int maxArea(int[] heights) {
        int len = heights.length;

        int l = 0, r = len-1;
        int width = r-l;
        int height = Math.min(heights[l], heights[r]);
        int maxi = width*height;
        while(l<r){
            width = r-l; 
            height = Math.min(heights[l], heights[r]);
            maxi = Math.max(maxi, width*height);
            if (heights[l] <= heights[r]) {
                l++;
            } else {
                r--;
            }
            
        }
        return maxi;        
    }
}
