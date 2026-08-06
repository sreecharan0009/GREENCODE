class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
        int x=1;
        int temp=n;
        while(temp>0){
            x*=temp%10;
            temp/=10;
        }
            if(x%t==0){
                return n;
            }
            n++;
        }
    }
}
