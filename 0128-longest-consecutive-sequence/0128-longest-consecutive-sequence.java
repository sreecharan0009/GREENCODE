class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> set=new HashSet<>();
        int cnt=0;int longest=1;
        int n=nums.length;
        if(n<=0) return 0;
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        for(int num:set){
            if(!set.contains(num-1)){
                cnt=1;
                int x=num;
                while(set.contains(x+1)){
                    x++;
                    cnt++;
                }
            }
            longest=Math.max(longest,cnt);
        }
        return longest;
    }
}