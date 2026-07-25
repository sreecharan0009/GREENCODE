class Solution {
    private int atmostk(int[] nums,int k){
        HashMap<Integer,Integer> freq=new HashMap<>();
        int l=0;int count=0;
        for(int r=0;r<nums.length;r++){
            freq.put(nums[r],freq.getOrDefault(nums[r],0)+1);
            if(freq.get(nums[r])==1) k--;
            while(k<0){
                freq.put(nums[l],freq.get(nums[l])-1);
                if(freq.get(nums[l])==0) k++;
                l++;
            }
            count+=(r-l+1);
        }
        return count;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atmostk(nums,k)-atmostk(nums,k-1);
    }
}