class Solution {
    public boolean isPerfectSquare(int num) {
        int low=0;int high=num;
        while(low<=high){
            int mid=low+(high-low)/2;
            long sqrt=(long)mid*mid;
            if(sqrt==num){
                return true;
            }
            else if(sqrt<num){
                low=mid+1;
            }
            else high=mid-1;
        }
        return false;
    }
}