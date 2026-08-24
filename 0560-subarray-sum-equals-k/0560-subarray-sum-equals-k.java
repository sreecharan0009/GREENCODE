class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int ps=0;int cnt=0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            ps+=nums[i];
            int pps=ps-k;
            cnt+=map.getOrDefault(pps,0);
            map.put(ps,map.getOrDefault(ps,0)+1);
        }
        return cnt;
    }
}