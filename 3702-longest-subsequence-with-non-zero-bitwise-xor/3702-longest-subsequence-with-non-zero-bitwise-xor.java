class Solution {
    public int longestSubsequence(int[] nums) {
        int x=0;
        boolean flag=false;
        for(int num:nums){
            x^=num;
            if(num!=0) flag=true;
        }
        if(x!=0) return nums.length;
        if(flag) return nums.length-1;
        return 0;

    }
}