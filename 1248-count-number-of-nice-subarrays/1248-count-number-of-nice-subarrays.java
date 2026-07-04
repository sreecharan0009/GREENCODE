class Solution {
    public int atmost(int[] nums,int k){
        int l=0,r=0,sum=0,c=0;
        while(r<nums.length){
            sum+=(nums[r]%2);
            while(sum>k){
                sum-=(nums[l]%2);
                l++;
            }
            c+=(r-l+1);
            r++;
        }
        return c;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        return atmost(nums,k)-atmost(nums,k-1);
    }
}