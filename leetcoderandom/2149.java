class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        int posind=0;int negind=1;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                arr[posind]=nums[i];
                posind+=2;
            }
            else{
                arr[negind]=nums[i];
                negind+=2;
            }
        }
        return arr;
    }
}