class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> ans=new HashSet<>();
        for(int x:nums){
            ans.add(x);
        }
        int i=k;
        while(ans.contains(i)){
            i+=k;
        }
        return i;
    }
}