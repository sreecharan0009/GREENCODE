class Solution {
    public int countSubstrings(String s) {
        int ps=0;int n=s.length();
        for(int i=0;i<n;i++){
            int p1=i;int p2=i;
            while(p1>=0 && p2<n && s.charAt(p1)==s.charAt(p2)){
                ps++;
                p1--;
                p2++;
            }
        }
        for(int i=0;i<n;i++){
            int p1=i;int p2=i+1;
            while(p1>=0 && p2<n && s.charAt(p1)==s.charAt(p2)){
                ps++;
                p1--;
                p2++;
            }
        }
        return ps;
    }
}