package BITMANIPULATION;

class Solution {
    public boolean consecutiveSetBits(int n) {
        int count=0;
        int flag=0;
        while(n>0){
            if((n&1)==1){
                if(flag==1){
                    count++;
                }
                flag=1;
            }
            else{
                flag=0;
            }
            n>>=1;
        }
    return count==1;
    }
}