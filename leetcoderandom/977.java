class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int p1=0;int p2=n-1;int idx=n-1;
        while(p1<=p2){
            int start=nums[p1]*nums[p1];
            int end=nums[p2]*nums[p2];
            if(start>end){
                ans[idx]=start;
                p1++;
            }
            else{
                ans[idx]=end;
                p2--;
            }
            idx--;
        }
        return ans;
    }
}