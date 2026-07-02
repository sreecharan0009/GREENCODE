class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int i=0;int j=n-1;
        int mw=0;
        while(i<j){
            int minDist=Math.min(height[i],height[j]);
            int distance=j-i;
            int area=minDist*distance;
            mw=Math.max(mw,area);
            if(height[i]<height[j]) i++;
            else j--;
        }
        return mw;
    }
}