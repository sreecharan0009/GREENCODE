
/*public class Solution {
    public int maxProduct(int[] nums) {
        int maxpro=nums[0];
        int minpro=nums[0];
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
            int cur=nums[i];
            if(cur<0){
                int temp=maxpro;
                maxpro=minpro;
                minpro=temp;
            }
            maxpro=Math.max(cur,maxpro*cur);
            minpro=Math.min(cur,minpro*cur);
            ans=Math.max(ans,maxpro);
        }
        return ans;
    }
}*/
