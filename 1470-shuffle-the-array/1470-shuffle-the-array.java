class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans= new int[nums.length];
        int i=0;int j=n;
        for(int k=1;k<=2*n;k+=2){
        ans[k-1]=nums[i];
        ans[k]=nums[j];
        i++;
        j++;
        }
        return ans;
    }
}