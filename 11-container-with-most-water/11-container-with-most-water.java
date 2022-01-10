class Solution {
    public int maxArea(int[] height) {
        int result = 0;
        int i = 0;
        int  j = height.length - 1;
        int minHeight;
        while(i < j){
            minHeight = Math.min(height[i], height[j]);
            int area = (j-i) * minHeight;
            if(area > result)
                result = area;
            if(height[i] >= height[j]){
                while(i < j && height[j] <= minHeight){
                    j--;
                }
            }else{
                while(i<j && height[i] <= minHeight){
                    i++;
                }
            }
        }
        return result;
    }
}