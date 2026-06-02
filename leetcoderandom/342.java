class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0) return false;
        int a=1;
        for(int i=0;i<16;i++){
            if(a==n){
                return true;
            }
            a=a*4;
        }
        return false;
    }
}