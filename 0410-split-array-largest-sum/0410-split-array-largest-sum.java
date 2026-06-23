class Solution {
    public boolean cansplit(int[]nums,int k,int limit){
        int count=1;
        int current=0;
        for(int num:nums){
            if(current+num>limit){
                count++;
                current=num;
            
            if(count>k){
                return false;
            }
            }
            else{
                current+=num;
            }
        }
        return true;
    }
    public int splitArray(int[] nums, int k) {
        int low=Integer.MIN_VALUE;int high=0;
        for(int i=0;i<nums.length;i++){
            low=Math.max(low,nums[i]);
            high+=nums[i];
        }
        while(low<=high){
            int mid=(low+high)/2;
            if(cansplit(nums,k,mid)){
                high=mid-1;
            }
            else low=mid+1;
        }
        return low;
    }
}