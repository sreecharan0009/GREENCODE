class Solution {
    public int thirdMax(int[] nums) {
        Integer m1=null;
        Integer m2=null;
        Integer m3=null;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if (m1 != null && nums[i] == m1 ||
                m2 != null && nums[i] == m2 ||
                m3 != null && nums[i] == m3) {
                continue;
            }
            if(m1==null || nums[i]>m1){
                m3=m2;
                m2=m1;
                m1=nums[i];
            }
            else if(m2==null || nums[i]>m2){
                m3=m2;
                m2=nums[i];
            }
            else if(m3==null || nums[i]>m3){
                m3=nums[i];
            }
        }
            if(m3==null) return m1;
            else return m3;
    }
}