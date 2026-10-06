class Solution {
    public int minAddToMakeValid(String s) {
        int op=0;
        int cp=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                op++;
            }
            else{
                if(op>0) op--;
                else cp++;
            }
        }
        return cp+op;
    }
}