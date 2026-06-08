class Solution {
    public int xorOperation(int n, int start) {
        int[] ans=new int[n];
        int x=0;
        for(int i=0;i<n;i++){
            ans[i]=start+2*i;
            x^=ans[i];
        }
        return x;
    }
}