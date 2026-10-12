class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        if(n==0) return 0;
        int k=0;
        for(int i=0;i<n;i++){
            if(k<2||nums[i]!=nums[k-2]){
            nums[k]=nums[i];
            k++;
        }
        }
        return k;
    }
}