class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxcandy=0;
        for(int i=0;i<candies.length;i++){
            maxcandy=Math.max(maxcandy,candies[i]);
        }
        List<Boolean> ans=new ArrayList<>();
        for(int candy:candies){
            ans.add(candy+extraCandies>=maxcandy);
        }
        return ans;
    }
}