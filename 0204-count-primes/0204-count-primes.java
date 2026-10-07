class Solution {
    public int countPrimes(int n) {
        if(n<=2) return 0;
        boolean[] ar=new boolean[n];
        Arrays.fill(ar,true);
        ar[0]=false;
        ar[1]=false;
        for(int i=2;i*i<n;i++){
            if(ar[i]){
                for(int j=i*i;j<n;j+=i){
                    ar[j]=false;
                }
            }
        }
        int c=0;
        for(int i=0;i<n;i++){
            if(ar[i]) c++;
        }
        return c;
        
        
    }
}