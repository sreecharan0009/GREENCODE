class Solution {
    public int numberOfSpecialChars(String word) {
        boolean[] hu=new boolean[26];
        boolean[] hl=new boolean[26];
        for(char ch:word.toCharArray()){
            if(Character.isLowerCase(ch)){
                hl[ch-'a']=true;
            }
            else{
                hu[ch-'A']=true;
            }
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(hl[i] && hu[i]){
                count++;
            }
        }
        return count;
    }
}