class Solution {
    public long maxSum(List<Integer> nums, int m, int k) {
       HashMap<Integer,Integer> freq=new HashMap<>();
       long sum=0;
       long ans=0;
       for(int i=0;i<nums.size();i++){
        int x=nums.get(i);
        sum+=x;
        freq.put(x,freq.getOrDefault(x,0)+1);
        if(i>=k){
            int y=nums.get(i-k);
            sum-=y;
            freq.put(y,freq.get(y)-1);
            if(freq.get(y)==0){
                freq.remove(y);
            }
        }
        if(i>=k-1 && freq.size()>=m) ans=Math.max(ans,sum);
       } 
       return ans;
    }
}