class Solution {
    public int numberOfSubstrings(String s) {
        int n=s.length();
        int p1=0;int p2=0;int ans=0;
        int a=0;int b=0;int c=0;
        while(p2<n){
            char ch=s.charAt(p2);
            if(ch=='a') a++;
            else if(ch=='b') b++;
            else c++;
            while(a>0 && b>0 && c>0){
                ans+=(n-p2);
                char remove=s.charAt(p1);
                if(remove=='a') a--;
                else if(remove=='b') b--;
                else c--;
                p1++;
            }
            p2++;
        }
        return ans;
    }
}