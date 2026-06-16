class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;int pro=1;
        int dup=n;
        while(n!=0){
            sum+=n%10;
            pro*=n%10;
            n/=10;
        }
        if(dup%(sum+pro)==0) return true;
        return false;
    }
}