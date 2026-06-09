class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int min=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
        return 1l*k*(max-min);
    }
}